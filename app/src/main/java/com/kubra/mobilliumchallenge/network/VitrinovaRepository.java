package com.kubra.mobilliumchallenge.network;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kubra.mobilliumchallenge.Serialize.CheckInterface;
import com.kubra.mobilliumchallenge.Serialize.CheckInterfaceDeserializer;
import com.kubra.mobilliumchallenge.model.BaseModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.kubra.mobilliumchallenge.Serialize.CheckInterfaceDeserializer.categories;
import static com.kubra.mobilliumchallenge.Serialize.CheckInterfaceDeserializer.collections;
import static com.kubra.mobilliumchallenge.Serialize.CheckInterfaceDeserializer.editor_shops;
import static com.kubra.mobilliumchallenge.Serialize.CheckInterfaceDeserializer.featured;
import static com.kubra.mobilliumchallenge.Serialize.CheckInterfaceDeserializer.new_products;
import static com.kubra.mobilliumchallenge.Serialize.CheckInterfaceDeserializer.new_shops;

public class VitrinovaRepository {
    private static VitrinovaRepository VitrinovaRepository;

    public static VitrinovaRepository getInstance() {
        if (VitrinovaRepository == null) {
            VitrinovaRepository = new VitrinovaRepository();
        }
        return VitrinovaRepository;
    }

    private ApiManager apiManager;

    public VitrinovaRepository() {
        apiManager = ApiManager.getInstance();
    }

    public MutableLiveData<List<BaseModel>> getVitriovaData() {

        final MutableLiveData<List<BaseModel>> vitrinovaData = new MutableLiveData<>();
        final List<BaseModel> list = new ArrayList<>();
        apiManager.addVersionData(new Callback<List<Object>>() {
            @Override
            public void onResponse(Call<List<Object>> call, Response<List<Object>> response) {
                Log.d("response", response.message());
                String json = new Gson().toJson(response.body());

                GsonBuilder builder = new GsonBuilder();

                builder.registerTypeAdapter(CheckInterface.class, new CheckInterfaceDeserializer());
                Gson gson = builder.create();

                CheckInterface[] result2 = gson.fromJson(json, CheckInterface[].class);
                list.add(featured);
                list.add(new_products);
                list.add(editor_shops);
                list.add(new_shops);
                list.add(collections);
                list.add(categories);
                vitrinovaData.setValue(list);

            }

            @Override
            public void onFailure(Call<List<Object>> call, Throwable t) {
                Log.d("response", t.getMessage());

            }
        });

        return vitrinovaData;
    }
}
