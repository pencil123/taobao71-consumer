package com.taobao71.tb71consumer.dao;

import com.taobao71.tb71consumer.domain.Coupon;
import org.springframework.stereotype.Service;

@Service
public interface CouponServer {
    public Integer addCoupon(Coupon coupon);
    public String getCouponUrlByItemId(String item_id);
}
