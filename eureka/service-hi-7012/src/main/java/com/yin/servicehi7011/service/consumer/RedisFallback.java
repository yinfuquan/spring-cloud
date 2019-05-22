package com.yin.servicehi7011.service.consumer;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/5/22
 * Time: 0:03
 * To change this template use File | Settings | File Templates.
 */
@Component
public class RedisFallback implements  RedisConsumer {
    @Override
    public String set(String key, String value) {
        return "垃圾电脑";
    }

    @Override
    public String get(String key) {
        return "垃圾电脑";
    }
}
