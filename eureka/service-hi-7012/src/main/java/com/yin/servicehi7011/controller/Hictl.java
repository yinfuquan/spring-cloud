package com.yin.servicehi7011.controller;

import com.yin.servicehi7011.service.consumer.RedisConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/5/20
 * Time: 11:17
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class Hictl {
    @Value("${server.port}")
    private String port;

    @Autowired
    private RedisConsumer redisConsumer;

    @RequestMapping(value = {"/redis/set"})
    @ResponseBody
    public String set(@RequestParam(value = "key") String key, @RequestParam(value = "value") String value)
    {
        return  redisConsumer.set(key,value);
    }
    @RequestMapping(value = {"/","hi"})
    @ResponseBody
    public  String sayHi(@RequestParam(value = "name") String name)
    {
        redisConsumer.set("name",name);
        return "hi:"+name+",port:"+port;
    }
    @RequestMapping(value = {"/redis/getvalue"})
    @ResponseBody
    public  String get(@RequestParam(value = "key") String key)
    {
        String value=redisConsumer.get(key);
        System.out.println(value);
        return  value;
    }

}
