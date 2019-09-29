package pers.swmmm.po;

import java.io.Serializable;

public class Goods implements Serializable {
    private Integer goodsId;
    private String goodsInfo;
    private String specifications;
    private String adInfo;

    public Goods(Integer goodsId, String goodsInfo, String specifications, String adInfo) {
        this.goodsId = goodsId;
        this.goodsInfo = goodsInfo;
        this.specifications = specifications;
        this.adInfo = adInfo;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getAdInfo() {
        return adInfo;
    }

    public void setAdInfo(String adInfo) {
        this.adInfo = adInfo;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsInfo='" + goodsInfo + '\'' +
                ", specifications='" + specifications + '\'' +
                ", adInfo='" + adInfo + '\'' +
                '}';
    }
}
