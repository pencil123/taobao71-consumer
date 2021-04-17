package com.taobao71.tb71consumer.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taobao71.tb71consumer.model.domain.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderServer extends IService<Order> {

  public boolean addOrder(Long orderId, Integer userId);
}
