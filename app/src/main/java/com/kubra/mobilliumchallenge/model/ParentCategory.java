
package com.kubra.mobilliumchallenge.model;


import com.google.gson.annotations.SerializedName;


public class ParentCategory {

    @SerializedName("id")
    private Long mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("order")
    private Long mOrder;
    @SerializedName("parent_category")
    private ParentCategory mParentCategory;
    @SerializedName("parent_id")
    private Object mParentId;

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Long getOrder() {
        return mOrder;
    }

    public void setOrder(Long order) {
        mOrder = order;
    }

    public ParentCategory getParentCategory() {
        return mParentCategory;
    }

    public void setParentCategory(ParentCategory parentCategory) {
        mParentCategory = parentCategory;
    }

    public Object getParentId() {
        return mParentId;
    }

    public void setParentId(Object parentId) {
        mParentId = parentId;
    }

}
