package com.taobao71.tb71consumer.dao;

import com.taobao71.tb71consumer.domain.ItemWithoutCoupon;
import org.springframework.stereotype.Service;

@Service
public interface ItemWithoutCoupnServer {
    public Integer addItemWithoutCoupon(ItemWithoutCoupon itemWithoutCoupon);
    public Integer getItemByItemID(Long item_id);
}
