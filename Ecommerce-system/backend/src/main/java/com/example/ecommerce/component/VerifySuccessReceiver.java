package com.example.ecommerce.component;

import com.example.ecommerce.dto.QueueEnum;
import com.example.ecommerce.service.ManagerService;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: rain
 * @date: 2020/6/8 16:21
 * @description:
 */
@Component
public class VerifySuccessReceiver {

    @Autowired
    private ManagerService managerService;

    @RabbitHandler
    public void handle(String ShopId)
    {
        managerService.VerifyShopRegisterSuccess(ShopId);
    }
}
