package com.taobao71.tb71consumer.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.taobao71.tb71consumer.Service.ItemServer;
import com.taobao71.tb71consumer.mapper.ItemMapper;
import com.taobao71.tb71consumer.model.domain.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemServerImpl extends ServiceImpl<ItemMapper, Item> implements ItemServer {
  public Item getItemByItemId(Long itemId){
    QueryWrapper<Item> wrapper = new QueryWrapper<>();
    wrapper.eq("item_id", itemId);
    return getOne(wrapper);
  }
}
