package pers.swmmm.po;

import java.io.Serializable;
import java.util.Date;

public class GoodsLog  implements Serializable {
    private String uuid;
    private Date clickDate;
    private String ip;
    private Integer id;

    public GoodsLog(String uuid, Date clickDate, String ip, Integer id) {
        this.uuid = uuid;
        this.clickDate = clickDate;
        this.ip = ip;
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getClickDate() {
        return clickDate;
    }

    public void setClickDate(Date clickDate) {
        this.clickDate = clickDate;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
