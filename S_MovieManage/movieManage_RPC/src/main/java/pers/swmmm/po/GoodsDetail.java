package pers.swmmm.po;

import java.io.Serializable;

public class GoodsDetail implements Serializable {
    private Integer id;
    private String goodsInfo;
    private String price;
    private String amount;

    public GoodsDetail(Integer id, String goodsInfo, String price, String amount) {
        this.id = id;
        this.goodsInfo = goodsInfo;
        this.price = price;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(String goodsInfo) {
        this.goodsInfo = goodsInfo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "GoodsDetail{" +
                "id=" + id +
                ", goodsInfo='" + goodsInfo + '\'' +
                ", price='" + price + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
