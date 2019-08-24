package com.kubra.mobilliumchallenge.model;

import com.kubra.mobilliumchallenge.Serialize.CheckInterface;

public class BaseModel implements CheckInterface {
    private String type, title;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
