package com.kubra.mobilliumchallenge.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IVitrinovaApi {

    @GET("discover")
    Call<List<Object>> getDatas();
}
