package com.taobao71.tb71consumer.Service;

import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.request.TbkItemInfoGetRequest;
import com.taobao71.tb71consumer.domain.ItemSearch;
import org.springframework.stereotype.Service;

@Service
public interface TaobaoClientServer {

    public Integer searchMaterial(TbkDgMaterialOptionalRequest tbkDgMaterialOptionalRequest,String searchId);

    public ItemSearch getItemInfo(TbkItemInfoGetRequest tbkItemInfoGetRequest);

    /**
     * 根据商品信息，搜索商品的Coupon
     * @param itemSearch
     * @return true找到了，false 没找到
     */
    public Boolean gainItemsByItem(ItemSearch itemSearch);
//    public String searchCouponByItemID(String itemId);
}
