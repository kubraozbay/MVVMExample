
package com.kubra.mobilliumchallenge.model;

import com.google.gson.annotations.SerializedName;

public class Featured {

    @SerializedName("cover")
    private Cover mCover;
    @SerializedName("id")
    private Long mId;
    @SerializedName("sub_title")
    private String mSubTitle;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("type")
    private String mType;

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

    public String getSubTitle() {
        return mSubTitle;
    }

    public void setSubTitle(String subTitle) {
        mSubTitle = subTitle;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

}
