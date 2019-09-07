package com.kubra.mobilliumchallenge.model;

import java.util.List;

public  class CategoriesList extends BaseModel {
    private List<Categories> categories;

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }
}

