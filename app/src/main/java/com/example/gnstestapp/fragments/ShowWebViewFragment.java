package com.example.gnstestapp.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.gnstestapp.R;
import com.example.gnstestapp.model.Repo;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class ShowWebViewFragment extends Fragment {
    public final static String REPO = "REPO";
    @BindView(R.id.web_view)
    WebView webView;

    private Unbinder unbinder;
    private Repo repo;

    public static ShowWebViewFragment newInstance(Repo repo) {
        ShowWebViewFragment fragment = new ShowWebViewFragment();
        Bundle args = new Bundle();
        args.putSerializable(REPO, repo);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            repo = (Repo) bundle.getSerializable(REPO);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.web_view_fragment, container, false);
        unbinder = ButterKnife.bind(this, v);
        webView.getSettings().setDomStorageEnabled(true);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setSupportZoom(true);
        webSettings.setDefaultTextEncodingName("utf-8");
        showView(repo.getUrl());
        return v;
    }

    public void showView(String url){
        webView.setVisibility(View.VISIBLE);
        webView.loadUrl(url);
        webView.setWebViewClient(new WebViewClient() {
                                     @Override
                                     public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                                         return super.shouldOverrideUrlLoading(view, request);
                                     }
                                 }
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
