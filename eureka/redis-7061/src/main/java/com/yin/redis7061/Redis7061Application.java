package com.yin.redis7061;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Redis7061Application {

    public static void main(String[] args) {
        SpringApplication.run(Redis7061Application.class, args);
    }

}
