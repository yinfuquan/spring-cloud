package com.yin.commonutils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/5/21
 * Time: 16:50
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class test {

    @Autowired
    RedisUtils redisUtils;
    @RequestMapping("/")
    @ResponseBody
    public  String test(){
      boolean s=  redisUtils.set("sss","aaaa");

    return "ok";
    }

}
