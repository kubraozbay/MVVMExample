package com.kubra.mobilliumchallenge.model;

import java.util.List;

public class FeaturedList extends BaseModel {
    private List<Featured> featured;

    public List<Featured> getFeatured() {
        return featured;
    }

    public void setFeatured(List<Featured> featured) {
        this.featured = featured;
    }
}
