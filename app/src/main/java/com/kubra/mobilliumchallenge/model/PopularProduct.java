
package com.kubra.mobilliumchallenge.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class PopularProduct {

    @SerializedName("cargo_time")
    private Long mCargoTime;
    @SerializedName("category")
    private Category mCategory;
    @SerializedName("category_id")
    private Long mCategoryId;
    @SerializedName("code")
    private Object mCode;
    @SerializedName("comment_count")
    private Long mCommentCount;
    @SerializedName("commission_rate")
    private Long mCommissionRate;
    @SerializedName("definition")
    private String mDefinition;
    @SerializedName("difference")
    private String mDifference;
    @SerializedName("id")
    private Long mId;
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
    private Long mLikeCount;
    @SerializedName("max_installment")
    private Object mMaxInstallment;
    @SerializedName("old_price")
    private Long mOldPrice;
    @SerializedName("price")
    private Long mPrice;
    @SerializedName("reject_reason")
    private Object mRejectReason;
    @SerializedName("share_url")
    private String mShareUrl;
    @SerializedName("slug")
    private String mSlug;
    @SerializedName("stock")
    private Long mStock;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("view_count")
    private Long mViewCount;

    public Long getCargoTime() {
        return mCargoTime;
    }

    public void setCargoTime(Long cargoTime) {
        mCargoTime = cargoTime;
    }

    public Category getCategory() {
        return mCategory;
    }

    public void setCategory(Category category) {
        mCategory = category;
    }

    public Long getCategoryId() {
        return mCategoryId;
    }

    public void setCategoryId(Long categoryId) {
        mCategoryId = categoryId;
    }

    public Object getCode() {
        return mCode;
    }

    public void setCode(Object code) {
        mCode = code;
    }

    public Long getCommentCount() {
        return mCommentCount;
    }

    public void setCommentCount(Long commentCount) {
        mCommentCount = commentCount;
    }

    public Long getCommissionRate() {
        return mCommissionRate;
    }

    public void setCommissionRate(Long commissionRate) {
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

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
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

    public Long getLikeCount() {
        return mLikeCount;
    }

    public void setLikeCount(Long likeCount) {
        mLikeCount = likeCount;
    }

    public Object getMaxInstallment() {
        return mMaxInstallment;
    }

    public void setMaxInstallment(Object maxInstallment) {
        mMaxInstallment = maxInstallment;
    }

    public Long getOldPrice() {
        return mOldPrice;
    }

    public void setOldPrice(Long oldPrice) {
        mOldPrice = oldPrice;
    }

    public Long getPrice() {
        return mPrice;
    }

    public void setPrice(Long price) {
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

    public String getSlug() {
        return mSlug;
    }

    public void setSlug(String slug) {
        mSlug = slug;
    }

    public Long getStock() {
        return mStock;
    }

    public void setStock(Long stock) {
        mStock = stock;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Long getViewCount() {
        return mViewCount;
    }

    public void setViewCount(Long viewCount) {
        mViewCount = viewCount;
    }

}
