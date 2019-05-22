package com.yin.redis7061.controller;

import com.yin.redis7061.sercice.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/5/22
 * Time: 0:16
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class RedisCtl {
    @Autowired
    private RedisService redisService;

    @RequestMapping("/redis/set")
    public String set(@RequestParam(value = "key") String key, @RequestParam(value = "value") String value) {
        return redisService.set(key, value);

    }

    @RequestMapping("/redis/get")
    public String get(@RequestParam(value = "key") String key) {
        String value = redisService.get(key);

        return redisService.get(key);
    }
}
