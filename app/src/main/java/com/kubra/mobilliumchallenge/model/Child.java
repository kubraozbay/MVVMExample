
package com.kubra.mobilliumchallenge.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class Child {

    @SerializedName("children")
    private List<Child> mChildren;
    @SerializedName("cover")
    private Cover mCover;
    @SerializedName("id")
    private Long mId;
    @SerializedName("logo")
    private Logo mLogo;
    @SerializedName("name")
    private String mName;
    @SerializedName("order")
    private Long mOrder;
    @SerializedName("parent_category")
    private ParentCategory mParentCategory;
    @SerializedName("parent_id")
    private Long mParentId;

    public List<Child> getChildren() {
        return mChildren;
    }

    public void setChildren(List<Child> children) {
        mChildren = children;
    }

    public Cover getCover() {
        return mCover;
    }

    public void setCover(Cover cover) {
        mCover = cover;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Logo getLogo() {
        return mLogo;
    }

    public void setLogo(Logo logo) {
        mLogo = logo;
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

    public Long getParentId() {
        return mParentId;
    }

    public void setParentId(Long parentId) {
        mParentId = parentId;
    }

}
