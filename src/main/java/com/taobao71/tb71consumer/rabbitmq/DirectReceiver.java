package com.taobao71.tb71consumer.rabbitmq;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.request.TbkItemInfoGetRequest;
import com.taobao71.tb71consumer.Service.Impl.TaobaoClientServerImpl;
import com.taobao71.tb71consumer.Service.TaobaoClientServer;
import com.taobao71.tb71consumer.domain.ItemSearch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RabbitListener(queues = "tkQueue")//监听的队列名称 TestDirectQueue
public class DirectReceiver {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private TaobaoClientServer taobaoClientServer;

    private TbkItemInfoGetRequest req = new TbkItemInfoGetRequest();
    static Logger logger = LoggerFactory.getLogger(DirectReceiver.class);

    @RabbitHandler
    public void process(Map itemMessage) {
        System.out.println("DirectReceiver消费者收到消息  : " + itemMessage.toString());
        req.setNumIids(itemMessage.get("itemId").toString());
        ItemSearch itemSearch = taobaoClientServer.getItemInfo(req);
        if( itemSearch != null){
            taobaoClientServer.gainItemsByItem(itemSearch);
        }else {
            logger.info("没有找到客户提交ID的商品信息。");
        }
    }
}
