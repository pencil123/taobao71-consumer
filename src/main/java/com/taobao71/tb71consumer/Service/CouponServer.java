package com.taobao71.tb71consumer.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taobao71.tb71consumer.model.domain.Coupon;
import com.taobao71.tb71consumer.model.vo.ItemResp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CouponServer extends IService<Coupon> {

  public List<ItemResp> searchCouponBySearchId(String searchid);

  public Coupon getCouponByItemId(String itemId);
}
