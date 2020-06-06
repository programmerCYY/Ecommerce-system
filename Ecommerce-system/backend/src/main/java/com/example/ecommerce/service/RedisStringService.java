package com.example.ecommerce.service;

/**
 * @author: rain
 * @date: 2020/6/6 20:24
 * @description:
 */
//存入的数据类型为字符串
public interface RedisStringService {
    /**
     * 存储数据
     */
    void set(String key, String value);

    /**
     * 获取数据
     */
    String get(String key);

    /**
     * 设置超期时间
     */
    boolean expire(String key, long expire);

    /**
     * 删除数据
     */
    void remove(String key);

    /**
     * 自增操作
     * @param delta 自增步长
     */
    Long increment(String key, long delta);

}
