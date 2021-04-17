package com.taobao71.tb71consumer.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.taobao71.tb71consumer.Service.ItemWithoutCouponServer;
import com.taobao71.tb71consumer.mapper.ItemWithoutCouponMapper;
import com.taobao71.tb71consumer.model.domain.ItemWithoutCoupon;
import org.springframework.stereotype.Service;

@Service
public class ItemWithoutCouponServerImpl extends ServiceImpl<ItemWithoutCouponMapper, ItemWithoutCoupon> implements ItemWithoutCouponServer {

}
