package com.example.ecommerce.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: rain
 * @date: 2020/6/1 12:48
 * @description:
 */
@Configuration
@MapperScan({"com.example.ecommerce.mbg.mapper","com.example.ecommerce.dao"})
public class MybatisConfig {
}
