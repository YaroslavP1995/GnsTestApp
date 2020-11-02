package com.example.gnstestapp;

import android.app.Application;

import com.example.gnstestapp.network.EventsApi;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {
    private static EventsApi eventsApi;
    private static final String BASE_URL = "https://api.github.com/";

    @Override
    public void onCreate() {
        super.onCreate();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        eventsApi = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(EventsApi.class);
    }

    public static EventsApi getEventsApi() {
        return eventsApi;
    }

}
