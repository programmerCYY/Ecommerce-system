package com.example.ecommerce.component;

import com.example.ecommerce.dto.QueueEnum;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: rain
 * @date: 2020/6/7 15:10
 * @description:
 */
@Component
public class ShopUpSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMessage(String goodid,Long delayTimes)
    {
        amqpTemplate.convertAndSend(QueueEnum.QUEUE_UP_TTL.getExchange(), QueueEnum.QUEUE_UP_TTL.getRouteKey(), goodid, new MessagePostProcessor() {
            @Override
            public Message postProcessMessage(Message message) throws AmqpException {
                message.getMessageProperties().setExpiration(String.valueOf(delayTimes));
                return message;
            }
        });

    }


}
