package com.taobao71.tb71consumer.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.taobao71.tb71consumer.model.domain.Item;
import org.springframework.stereotype.Service;

@Service
public interface ItemServer extends IService<Item> {
  public Item getItemByItemId(Long itemId);
}
