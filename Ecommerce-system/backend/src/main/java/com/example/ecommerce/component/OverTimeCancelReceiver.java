package com.example.ecommerce.component;

import com.example.ecommerce.service.ManagerService;
import org.apache.catalina.Manager;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: rain
 * @date: 2020/6/7 14:43
 * @description:
 */
@Component
@RabbitListener(queues = "ecommerce.shop.cancel")
public class OverTimeCancelReceiver {

    @Autowired
    private ManagerService managerService;

    @RabbitHandler
    public void handle(String username)
    {
        /*//取消订单
        managerService.sendRegisterEmail(username,"订单因超时取消");
  */  }

}
