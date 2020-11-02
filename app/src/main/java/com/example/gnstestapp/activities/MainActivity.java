package com.example.gnstestapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.example.gnstestapp.App;
import com.example.gnstestapp.R;
import com.example.gnstestapp.adapters.EventItemAdapter;
import com.example.gnstestapp.fragments.ShowWebViewFragment;
import com.example.gnstestapp.model.Events;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements EventItemAdapter.RecyclerClickListener{
    @BindView(R.id.events_recycle_view)
    RecyclerView recyclerView;
    @BindView(R.id.pb_loading)
    ProgressBar pbLoading;

    private final String BROADCAST_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
    private final String LOG_TAG = "myLogs";
    private Unbinder unbinder;
    private List<Events> eventsList = new ArrayList<>();
    private EventItemAdapter eventItemAdapter;
    private ShowWebViewFragment webViewFragment;
    private boolean canClick = false;

    IntentFilter intentFilter = new IntentFilter(BROADCAST_ACTION);
    BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            switch (action) {
                case BROADCAST_ACTION:
                    final ConnectivityManager connMgr = (ConnectivityManager) context
                            .getSystemService(Context.CONNECTIVITY_SERVICE);

                    final NetworkInfo wifi = connMgr
                            .getNetworkInfo(ConnectivityManager.TYPE_WIFI);

                    final NetworkInfo mobile = connMgr
                            .getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

                    if (wifi != null && wifi.isAvailable() || mobile != null && mobile.isAvailable()) {
                        canClick = true;
                        getListEvents();
                    }else if (!wifi.isAvailable() || !mobile.isAvailable()){
                        canClick = false;
                        Toast.makeText(MainActivity.this, "Please check your internet connection", Toast.LENGTH_LONG).show();
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + action);
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder = ButterKnife.bind(this);
        registerReceiver(receiver, intentFilter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        eventItemAdapter = new EventItemAdapter(eventsList, this, this);
        recyclerView.setAdapter(eventItemAdapter);
    }

    private void getListEvents() {
        App.getEventsApi().getCollectionList().enqueue(new Callback<List<Events>>() {
            @Override
            public void onResponse(@NotNull Call<List<Events>> call, @NotNull Response<List<Events>> response) {
                if (response.isSuccessful()) {
                    canClick = true;
                    eventsList = response.body();
                    eventItemAdapter.setEventsList(eventsList);
                    pbLoading.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<List<Events>> call, Throwable t) {
                Log.d(LOG_TAG, "onFailure:" + t.fillInStackTrace());
                if (t.getMessage() != null && t.getMessage().contains("Unable to resolve host")){
                    canClick = false;
                    Toast.makeText(MainActivity.this, "Please check your internet connection", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onItemClicked(int position) {
        if(canClick){
            Events events = eventsList.get(position);
            webViewFragment =  ShowWebViewFragment.newInstance(events.getRepo());
            showWebViewFragment(webViewFragment);
        }else {
            Toast.makeText(MainActivity.this, "Please check your internet connection", Toast.LENGTH_LONG).show();
        }

    }

    private void showWebViewFragment(Fragment currentFragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, currentFragment, LOG_TAG);
        fragmentTransaction.addToBackStack("MainTag").commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(receiver, intentFilter);
    }
    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(receiver);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}