package com.shen.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author 申宇强
 * @Date 2024/5/8 下午11:27
 */
//事务操作，由于Spring没有专门的Redis事务管理器，所以只能借用JDBC提供的
public class RedisService {
    @Resource
    StringRedisTemplate template;

    @PostConstruct
    public void init() {
        template.setEnableTransactionSupport(true);//开启事务
    }

    @Transactional
    public void test() {
        template.multi();
        template.opsForValue().set("d", "xxxxx");
        template.exec();
    }
}
