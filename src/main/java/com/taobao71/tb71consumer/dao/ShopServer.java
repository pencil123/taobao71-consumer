package com.taobao71.tb71consumer.dao;

import com.taobao71.tb71consumer.domain.Shop;
import org.springframework.stereotype.Service;

@Service
public interface ShopServer {
    public Integer addShop(Shop shop);
}
