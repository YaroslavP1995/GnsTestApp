package com.example.gnstestapp.network;

import com.example.gnstestapp.model.Events;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EventsApi {
    @GET("events")
    Call<List<Events>> getCollectionList();
}
