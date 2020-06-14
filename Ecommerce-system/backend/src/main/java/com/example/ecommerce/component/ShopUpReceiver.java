package com.example.ecommerce.component;

import com.example.ecommerce.service.ManagerService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: rain
 * @date: 2020/6/7 15:10
 * @description:
 */
@Component
@RabbitListener(queues = "ecommerce.shop.up")
public class ShopUpReceiver {

    @Autowired
    private ManagerService managerService;

    public void handle(String[] goodid_state)
    {
       managerService.VerifyGoodSendEmail(goodid_state[0],goodid_state[1]);
    }

}
