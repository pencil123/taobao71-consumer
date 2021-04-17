package com.taobao71.tb71consumer.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.taobao71.tb71consumer.Service.OrderServer;
import com.taobao71.tb71consumer.mapper.OrderMapper;
import com.taobao71.tb71consumer.model.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServerImpl extends ServiceImpl<OrderMapper, Order> implements OrderServer {
  @Autowired Order order;

  public boolean addOrder(Long orderId,Integer userId){
    order.setOrderid(orderId);
    order.setUserId(userId);
    return save(order);
  }
}
