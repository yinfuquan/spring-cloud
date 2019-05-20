package com.yin.feign7031.ctl;

import com.yin.feign7031.service.IsayHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/5/20
 * Time: 11:17
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class Hictl {
    @Autowired
    private IsayHi isayHi;
    @RequestMapping(value = {"hi"})
    public  String sayHi(@RequestParam(value = "name") String name){
      return   isayHi.sayHi(name);
    }
}
