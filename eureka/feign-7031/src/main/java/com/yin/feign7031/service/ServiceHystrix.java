package com.yin.feign7031.service;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/5/20
 * Time: 13:59
 * To change this template use File | Settings | File Templates.
 */
@Component
public class ServiceHystrix implements  IsayHi {
    @Override
    public String sayHi(String name) {
        return "垃圾电脑挂了";
    }
}
