
package com.kubra.mobilliumchallenge.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class Products {

    @SerializedName("cargo_time")
    private int mCargoTime;
    @SerializedName("category")
    private Category mCategory;
    @SerializedName("category_id")
    private int mCategoryId;
    @SerializedName("code")
    private Object mCode;
    @SerializedName("comment_count")
    private int mCommentCount;
    @SerializedName("commission_rate")
    private int mCommissionRate;
    @SerializedName("definition")
    private String mDefinition;
    @SerializedName("difference")
    private String mDifference;
    @SerializedName("id")
    private int mId;
    @SerializedName("images")
    private List<Image> mImages;
    @SerializedName("is_active")
    private Boolean mIsActive;
    @SerializedName("is_approved")
    private Boolean mIsApproved;
    @SerializedName("is_cargo_free")
    private Boolean mIsCargoFree;
    @SerializedName("is_editor_choice")
    private Boolean mIsEditorChoice;
    @SerializedName("is_liked")
    private Boolean mIsLiked;
    @SerializedName("is_new")
    private Boolean mIsNew;
    @SerializedName("is_owner")
    private Boolean mIsOwner;
    @SerializedName("like_count")
    private int mLikeCount;
    @SerializedName("max_installment")
    private Object mMaxInstallment;
    @SerializedName("old_price")
    private int mOldPrice;
    @SerializedName("price")
    private int mPrice;
    @SerializedName("reject_reason")
    private Object mRejectReason;
    @SerializedName("share_url")
    private String mShareUrl;
    @SerializedName("shop")
    private Shop mShop;
    @SerializedName("slug")
    private String mSlug;
    @SerializedName("stock")
    private int mStock;
    @SerializedName("title")
    private String mTitle;

    public int getCargoTime() {
        return mCargoTime;
    }

    public void setCargoTime(int cargoTime) {
        mCargoTime = cargoTime;
    }

    public Category getCategory() {
        return mCategory;
    }

    public void setCategory(Category category) {
        mCategory = category;
    }

    public int getCategoryId() {
        return mCategoryId;
    }

    public void setCategoryId(int categoryId) {
        mCategoryId = categoryId;
    }

    public Object getCode() {
        return mCode;
    }

    public void setCode(Object code) {
        mCode = code;
    }

    public int getCommentCount() {
        return mCommentCount;
    }

    public void setCommentCount(int commentCount) {
        mCommentCount = commentCount;
    }

    public int getCommissionRate() {
        return mCommissionRate;
    }

    public void setCommissionRate(int commissionRate) {
        mCommissionRate = commissionRate;
    }

    public String getDefinition() {
        return mDefinition;
    }

    public void setDefinition(String definition) {
        mDefinition = definition;
    }

    public String getDifference() {
        return mDifference;
    }

    public void setDifference(String difference) {
        mDifference = difference;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public List<Image> getImages() {
        return mImages;
    }

    public void setImages(List<Image> images) {
        mImages = images;
    }

    public Boolean getIsActive() {
        return mIsActive;
    }

    public void setIsActive(Boolean isActive) {
        mIsActive = isActive;
    }

    public Boolean getIsApproved() {
        return mIsApproved;
    }

    public void setIsApproved(Boolean isApproved) {
        mIsApproved = isApproved;
    }

    public Boolean getIsCargoFree() {
        return mIsCargoFree;
    }

    public void setIsCargoFree(Boolean isCargoFree) {
        mIsCargoFree = isCargoFree;
    }

    public Boolean getIsEditorChoice() {
        return mIsEditorChoice;
    }

    public void setIsEditorChoice(Boolean isEditorChoice) {
        mIsEditorChoice = isEditorChoice;
    }

    public Boolean getIsLiked() {
        return mIsLiked;
    }

    public void setIsLiked(Boolean isLiked) {
        mIsLiked = isLiked;
    }

    public Boolean getIsNew() {
        return mIsNew;
    }

    public void setIsNew(Boolean isNew) {
        mIsNew = isNew;
    }

    public Boolean getIsOwner() {
        return mIsOwner;
    }

    public void setIsOwner(Boolean isOwner) {
        mIsOwner = isOwner;
    }

    public int getLikeCount() {
        return mLikeCount;
    }

    public void setLikeCount(int likeCount) {
        mLikeCount = likeCount;
    }

    public Object getMaxInstallment() {
        return mMaxInstallment;
    }

    public void setMaxInstallment(Object maxInstallment) {
        mMaxInstallment = maxInstallment;
    }

    public int getOldPrice() {
        return mOldPrice;
    }

    public void setOldPrice(int oldPrice) {
        mOldPrice = oldPrice;
    }

    public int getPrice() {
        return mPrice;
    }

    public void setPrice(int price) {
        mPrice = price;
    }

    public Object getRejectReason() {
        return mRejectReason;
    }

    public void setRejectReason(Object rejectReason) {
        mRejectReason = rejectReason;
    }

    public String getShareUrl() {
        return mShareUrl;
    }

    public void setShareUrl(String shareUrl) {
        mShareUrl = shareUrl;
    }

    public Shop getShop() {
        return mShop;
    }

    public void setShop(Shop shop) {
        mShop = shop;
    }

    public String getSlug() {
        return mSlug;
    }

    public void setSlug(String slug) {
        mSlug = slug;
    }

    public int getStock() {
        return mStock;
    }

    public void setStock(int stock) {
        mStock = stock;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
