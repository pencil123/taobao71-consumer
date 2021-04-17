package com.taobao71.tb71consumer.Service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.taobao71.tb71consumer.Service.ShopServer;
import com.taobao71.tb71consumer.mapper.ShopMapper;
import com.taobao71.tb71consumer.model.domain.Shop;
import org.springframework.stereotype.Service;

@Service
public class ShopServerImpl extends ServiceImpl<ShopMapper, Shop> implements ShopServer {
}
