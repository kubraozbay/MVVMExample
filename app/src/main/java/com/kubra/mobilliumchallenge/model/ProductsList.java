package com.kubra.mobilliumchallenge.model;

import java.util.List;

public class ProductsList extends BaseModel {
    private List<Products> products;

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}
