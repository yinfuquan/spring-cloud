package com.yin.feign7031.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi",fallback = ServiceHystrix.class)
public interface IsayHi {

    @RequestMapping(value ={"hi"},method = RequestMethod.GET)
     public String sayHi(@RequestParam(value = "name") String name);
}
