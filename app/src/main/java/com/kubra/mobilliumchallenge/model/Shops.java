
package com.kubra.mobilliumchallenge.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class Shops {

    @SerializedName("comment_count")
    private Long mCommentCount;
    @SerializedName("cover")
    private Cover mCover;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("definition")
    private String mDefinition;
    @SerializedName("follower_count")
    private Long mFollowerCount;
    @SerializedName("id")
    private Long mId;
    @SerializedName("is_editor_choice")
    private Boolean mIsEditorChoice;
    @SerializedName("is_following")
    private Boolean mIsFollowing;
    @SerializedName("logo")
    private Logo mLogo;
    @SerializedName("name")
    private String mName;
    @SerializedName("name_updateable")
    private Boolean mNameUpdateable;
    @SerializedName("popular_products")
    private List<PopularProduct> mPopularProducts;
    @SerializedName("product_count")
    private Long mProductCount;
    @SerializedName("share_url")
    private String mShareUrl;
    @SerializedName("shop_payment_id")
    private Long mShopPaymentId;
    @SerializedName("shop_rate")
    private Long mShopRate;
    @SerializedName("slug")
    private String mSlug;
    @SerializedName("vacation_mode")
    private Long mVacationMode;

    public Long getCommentCount() {
        return mCommentCount;
    }

    public void setCommentCount(Long commentCount) {
        mCommentCount = commentCount;
    }

    public Cover getCover() {
        return mCover;
    }

    public void setCover(Cover cover) {
        mCover = cover;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public String getDefinition() {
        return mDefinition;
    }

    public void setDefinition(String definition) {
        mDefinition = definition;
    }

    public Long getFollowerCount() {
        return mFollowerCount;
    }

    public void setFollowerCount(Long followerCount) {
        mFollowerCount = followerCount;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public Boolean getIsEditorChoice() {
        return mIsEditorChoice;
    }

    public void setIsEditorChoice(Boolean isEditorChoice) {
        mIsEditorChoice = isEditorChoice;
    }

    public Boolean getIsFollowing() {
        return mIsFollowing;
    }

    public void setIsFollowing(Boolean isFollowing) {
        mIsFollowing = isFollowing;
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

    public Boolean getNameUpdateable() {
        return mNameUpdateable;
    }

    public void setNameUpdateable(Boolean nameUpdateable) {
        mNameUpdateable = nameUpdateable;
    }

    public List<PopularProduct> getPopularProducts() {
        return mPopularProducts;
    }

    public void setPopularProducts(List<PopularProduct> popularProducts) {
        mPopularProducts = popularProducts;
    }

    public Long getProductCount() {
        return mProductCount;
    }

    public void setProductCount(Long productCount) {
        mProductCount = productCount;
    }

    public String getShareUrl() {
        return mShareUrl;
    }

    public void setShareUrl(String shareUrl) {
        mShareUrl = shareUrl;
    }

    public Long getShopPaymentId() {
        return mShopPaymentId;
    }

    public void setShopPaymentId(Long shopPaymentId) {
        mShopPaymentId = shopPaymentId;
    }

    public Long getShopRate() {
        return mShopRate;
    }

    public void setShopRate(Long shopRate) {
        mShopRate = shopRate;
    }

    public String getSlug() {
        return mSlug;
    }

    public void setSlug(String slug) {
        mSlug = slug;
    }

    public Long getVacationMode() {
        return mVacationMode;
    }

    public void setVacationMode(Long vacationMode) {
        mVacationMode = vacationMode;
    }

}
