package com.example.ecommerce;

import com.example.ecommerce.dao.AddSkuDao;
import com.example.ecommerce.mbg.mapper.UserrMapper;
import com.example.ecommerce.mbg.model.GoodSku;
import com.example.ecommerce.mbg.model.Userr;
import com.example.ecommerce.service.ManagerService;
import com.example.ecommerce.service.UserrService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SpringBootTest
class EcommerceApplicationTests {

    @Autowired(required = false)
    private AddSkuDao addSkuDao;



    @Test
    public void contextLoads() {

      /*  List<GoodSku> list = new ArrayList<>();
        GoodSku goodSku = new GoodSku();

        BigDecimal a =new BigDecimal("123.33");

        goodSku.setAttribute("123");
        goodSku.setGoodid("766");
        goodSku.setLeftNumber(123);
        goodSku.setNumber(123);
        goodSku.setPicture("123");
        goodSku.setPrice(a);
        goodSku.setSoldNumber(123);
        goodSku.setVipprice(a);

        list.add(goodSku);

        System.out.println(list.get(0));

        addSkuDao.InsertList(list);*/
    }

}
