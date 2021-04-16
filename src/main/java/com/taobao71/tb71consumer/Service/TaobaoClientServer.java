package com.taobao71.tb71consumer.Service;

import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.request.TbkItemInfoGetRequest;
import com.taobao71.tb71consumer.model.domain.Item;
import org.springframework.stereotype.Service;

@Service
public interface TaobaoClientServer {

    public Integer searchMaterial(TbkDgMaterialOptionalRequest tbkDgMaterialOptionalRequest,String searchId);

    public Item getItemInfo(TbkItemInfoGetRequest tbkItemInfoGetRequest);

    /**
     * 根据商品信息，搜索商品的Coupon
     * @param item
     * @return true找到了，false 没找到
     */
    public Boolean gainItemsByItem(Item item);
//    public String searchCouponByItemID(String itemId);
}
