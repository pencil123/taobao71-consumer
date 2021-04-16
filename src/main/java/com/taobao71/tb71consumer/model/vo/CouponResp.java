package com.taobao71.tb71consumer.model.vo;

import java.io.Serializable;
import org.springframework.stereotype.Component;

/**
 * 优惠券响应wx信息
 * 不存储数据库
 */

@Component
public class CouponResp implements Serializable {
    private String title;
    private String pict_url;
    private String tpwd;
    private String small_images;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPict_url() {
        return pict_url;
    }

    public void setPict_url(String pict_url) {
        this.pict_url = pict_url;
    }

    public String getTpwd() {
        return tpwd;
    }

    public void setTpwd(String tpwd) {
        this.tpwd = tpwd;
    }

    public String getSmall_images() {
        return small_images;
    }

    public void setSmall_images(String small_images) {
        this.small_images = small_images;
    }
}
