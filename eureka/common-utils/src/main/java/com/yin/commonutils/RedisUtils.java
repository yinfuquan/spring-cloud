package com.yin.commonutils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/5/21
 * Time: 16:14
 * To change this template use File | Settings | File Templates.
 */
@Component
public class RedisUtils {

    @Autowired
   JedisPool jedisPool;

    /**
     * 读取缓存
     *
     * @param key
     * @return
     */
    public   Object get(final String key) {

        return jedisPool.getResource().get(key);
    }
    /**
     * 写入缓存
     *
     * @param key
     * @param value
     * @return
     */
    public  boolean set(final String key, String value) {
       Jedis jedis= jedisPool.getResource();
       jedis.set(key,value);
       return true;
    }

}
