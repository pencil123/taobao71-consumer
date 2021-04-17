package com.taobao71.tb71consumer.Service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.taobao71.tb71consumer.Service.ItemSearchServer;
import com.taobao71.tb71consumer.mapper.ItemSearchMapper;
import com.taobao71.tb71consumer.model.domain.ItemSearch;
import org.springframework.stereotype.Service;

@Service
public class ItemSearchServerImpl extends ServiceImpl<ItemSearchMapper, ItemSearch> implements ItemSearchServer {

    public ItemSearch getByKeyword(String keyword){
        QueryWrapper<ItemSearch> wrapper = new QueryWrapper<>();
        wrapper.eq("keyword", keyword);
        return getOne(wrapper);
    }
}
