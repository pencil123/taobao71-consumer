package com.taobao71.tb71consumer.dao;

import org.springframework.stereotype.Service;

@Service
public interface CouponResultServer {
    public String couponExist(Long item_id);
}
