package com.yin.servicehi7011.service.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-redis",fallback = RedisFallback.class)
public interface RedisConsumer {
    @RequestMapping("/redis/set")
    public String set(@RequestParam(value = "key") String key, @RequestParam(value = "value") String value);
    @RequestMapping("/redis/get")
    public  String get(@RequestParam(value = "key") String key);
}
