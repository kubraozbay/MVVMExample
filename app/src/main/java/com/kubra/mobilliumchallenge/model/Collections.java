
package com.kubra.mobilliumchallenge.model;


import com.google.gson.annotations.SerializedName;


public class Collections {

    @SerializedName("cover")
    private Cover mCover;
    @SerializedName("definition")
    private String mDefinition;
    @SerializedName("end")
    private Object mEnd;
    @SerializedName("id")
    private Long mId;
    @SerializedName("logo")
    private Logo mLogo;
    @SerializedName("share_url")
    private String mShareUrl;
    @SerializedName("start")
    private String mStart;
    @SerializedName("title")
    private String mTitle;

    public Cover getCover() {
        return mCover;
    }

    public void setCover(Cover cover) {
        mCover = cover;
    }

    public String getDefinition() {
        return mDefinition;
    }

    public void setDefinition(String definition) {
        mDefinition = definition;
    }

    public Object getEnd() {
        return mEnd;
    }

    public void setEnd(Object end) {
        mEnd = end;
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

    public String getShareUrl() {
        return mShareUrl;
    }

    public void setShareUrl(String shareUrl) {
        mShareUrl = shareUrl;
    }

    public String getStart() {
        return mStart;
    }

    public void setStart(String start) {
        mStart = start;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
