package com.taobao71.tb71consumer.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.taobao71.tb71consumer.Service.CouponServer;
import com.taobao71.tb71consumer.mapper.CouponMapper;
import com.taobao71.tb71consumer.model.domain.Coupon;
import com.taobao71.tb71consumer.model.vo.ItemResp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class CouponServerImpl extends ServiceImpl<CouponMapper, Coupon> implements CouponServer {

  public List<ItemResp> searchCouponBySearchId(String searchid){
    return baseMapper.selectItemRespBySearchId(searchid);
  }

  public Coupon getCouponByItemId(String itemId){
    QueryWrapper<Coupon> wrapper = new QueryWrapper<>();
    wrapper.eq("item_id", itemId);
    return getOne(wrapper);
  }
}
