package com.kubra.mobilliumchallenge.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.kubra.mobilliumchallenge.model.BaseModel;
import com.kubra.mobilliumchallenge.network.VitrinovaRepository;

import java.util.List;

public class VitrinovaViewModel extends ViewModel {

    private MutableLiveData<List<BaseModel>> mutableLiveData;
    private VitrinovaRepository newsRepository;

    public void init() {
        if (mutableLiveData != null) {
            return;
        }
        newsRepository = VitrinovaRepository.getInstance();
        mutableLiveData = newsRepository.getVitriovaData();

    }

    public LiveData<List<BaseModel>> getNewsRepository() {
        return mutableLiveData;
    }
}
