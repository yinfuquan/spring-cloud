package com.yin.redis7061.sercice.impl;

import com.yin.redis7061.sercice.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/5/21
 * Time: 23:53
 * To change this template use File | Settings | File Templates.
 */
@Service
public class RedisServiceImpl implements RedisService {

    private  static  String RESULT="Ok";

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Override
    public String set(String key, String value) {
        redisTemplate.opsForValue().set(key,value);
        return RESULT;
    }

    @Override
    public String get(String key) {
        redisTemplate.opsForValue().get(key);
        return redisTemplate.opsForValue().get(key);
    }
}
