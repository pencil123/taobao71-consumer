package com.taobao71.tb71consumer.dao;

import com.taobao71.tb71consumer.domain.Item;
import org.springframework.stereotype.Service;

@Service
public interface ItemServer {
    public Integer addItem(Item item);
    public Integer itemExistRetrunId(Long item_id);
}
