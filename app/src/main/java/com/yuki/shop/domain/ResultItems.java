package com.yuki.shop.domain;

public class ResultItems {

    private String pic_url;
    private String detail_url;
    private float price;
    private String platform_item;

    public ResultItems(String pic_url, String detail_url, float price, String platform_item) {
        this.pic_url = pic_url;
        this.detail_url = detail_url;
        this.price = price;
        this.platform_item = platform_item;
    }

    public String getPic_url() {
        return pic_url;
    }

    public String getDetail_url() {
        return detail_url;
    }

    public float getPrice() {
        return price;
    }

    public String getPlatform_item() {
        return platform_item;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public void setDetail_url(String detail_url) {
        this.detail_url = detail_url;
    }

    public void setPrice(float  price) {
        this.price = price;
    }

    public void setPlatform_item(String platform_item) {
        this.platform_item = platform_item;
    }

}
