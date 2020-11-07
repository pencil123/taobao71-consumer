package com.taobao71.tb71consumer.Service;

import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.request.TbkItemInfoGetRequest;
import org.springframework.stereotype.Service;

@Service
public interface TaobaoClientServer {

    public String searchMaterial(TbkDgMaterialOptionalRequest tbkDgMaterialOptionalRequest);

    public String getItemInfo(TbkItemInfoGetRequest tbkItemInfoGetRequest);

//    public String searchCouponByItemID(String itemId);
}
