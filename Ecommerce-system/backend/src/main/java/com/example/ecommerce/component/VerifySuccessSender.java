package com.example.ecommerce.component;

import com.example.ecommerce.dto.QueueEnum;
import com.example.ecommerce.service.ManagerService;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: rain
 * @date: 2020/6/8 16:21
 * @description:
 */
@Component
@RabbitListener(queues = "ecommerce.shop.success")
public class VerifySuccessSender {


    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMessage(String username,Long delayTimes)
    {
        amqpTemplate.convertAndSend(QueueEnum.QUEUE_REGISTER_SUCCESS_TTL.getExchange(), QueueEnum.QUEUE_REGISTER_SUCCESS_TTL.getRouteKey(), username, new MessagePostProcessor() {
            @Override
            public Message postProcessMessage(Message message) throws AmqpException {
                message.getMessageProperties().setExpiration(String.valueOf(delayTimes));
                return message;
            }
        });
    }
}
