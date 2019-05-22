package com.yin.redis7061.sercice;

public interface RedisService {
    public String set(String key,String value);
    public  String get(String key);
}
