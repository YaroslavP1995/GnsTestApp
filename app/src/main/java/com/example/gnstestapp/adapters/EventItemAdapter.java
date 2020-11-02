package com.example.gnstestapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.gnstestapp.R;
import com.example.gnstestapp.model.Events;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

public class EventItemAdapter extends RecyclerView.Adapter<EventItemAdapter.EventHolder> {
    private List<Events> eventsList;
    private Context context;
    private RecyclerClickListener recyclerClickListener;

    public EventItemAdapter(List<Events> eventsList, Context context, RecyclerClickListener recyclerClickListener){
        this.eventsList = eventsList;
        this.context = context;
        this.recyclerClickListener = recyclerClickListener;
    }

   public void setEventsList(List<Events> eventsList) {
        this.eventsList = eventsList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public EventHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_item_layout, parent, false);
        return new EventHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventHolder holder, int position) {
        String url = eventsList.get(position).getActor().getAvatarUrl();
        Glide.with(context)
                .load(url)
                .into(holder.imageView);
        holder.name.setText(eventsList.get(position).getRepo().getName());
        holder.eventTypeAndDate.setText(eventsList.get(position).getType()+" "+eventsList.get(position).getCreatedAt());
        holder.llListItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerClickListener.onItemClicked(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (eventsList == null)
            return 0;
        return eventsList.size();
    }

    static class EventHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.repo_name)
        TextView name;
        @BindView(R.id.event_type_and_date)
        TextView eventTypeAndDate;
        @BindView(R.id.image_view)
        ImageView imageView;
        @BindView(R.id.ll_list_item)
        LinearLayout llListItem;

        EventHolder(View v) {
            super(v);
            ButterKnife.bind(this, v);
        }
    }

   public interface RecyclerClickListener{
        void onItemClicked(int position);
    }
}
