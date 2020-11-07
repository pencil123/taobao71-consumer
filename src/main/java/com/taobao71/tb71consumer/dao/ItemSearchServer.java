package com.taobao71.tb71consumer.dao;

import com.taobao71.tb71consumer.domain.ItemSearch;
import org.springframework.stereotype.Service;

@Service
public interface ItemSearchServer {
    public Integer addItemSearch(ItemSearch itemSearch);
    public Integer itemExistRetrunId(Long item_id) ;
}
