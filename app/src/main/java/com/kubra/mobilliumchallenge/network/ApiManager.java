package com.kubra.mobilliumchallenge.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiManager {
    private static Retrofit retrofit;
    private static final String BASE_URL = "https://www.vitrinova.com/api/v2/";

    private static IVitrinovaApi service;
    private static ApiManager apiManager;

    private ApiManager() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(IVitrinovaApi.class);
    }

    public static ApiManager getInstance() {
        if (apiManager == null) {
            apiManager = new ApiManager();
        }
        return apiManager;
    }

    public void addVersionData(Callback<List<Object>> callback) {
        Call<List<Object>> userCall = service.getDatas();
        userCall.enqueue(callback);
    }
}
