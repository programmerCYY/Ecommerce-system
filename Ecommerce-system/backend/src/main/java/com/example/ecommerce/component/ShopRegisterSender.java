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
 * @date: 2020/6/7 14:50
 * @description:
 */
@Component
public class ShopRegisterSender {


    @Autowired
    private AmqpTemplate amqpTemplate;
    public void sendMessage(String[] SellerId_RegisterState,Long delayTimes)
    {
        amqpTemplate.convertAndSend(QueueEnum.QUEUE_REGISTER_TTL.getExchange(), QueueEnum.QUEUE_REGISTER_TTL.getRouteKey(), SellerId_RegisterState, new MessagePostProcessor() {
            @Override
            public Message postProcessMessage(Message message) throws AmqpException {
                message.getMessageProperties().setExpiration(String.valueOf(delayTimes));
                return message;
            }
        });
    }
}
