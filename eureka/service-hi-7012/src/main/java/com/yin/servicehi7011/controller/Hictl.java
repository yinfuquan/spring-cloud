package com.yin.servicehi7011.controller;

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
    @RequestMapping(value = {"/","hi"})
    @ResponseBody
    public  String sayHi(@RequestParam(value = "name") String name)
    {
        return "hi:"+name+",port:"+port;
    }
}
