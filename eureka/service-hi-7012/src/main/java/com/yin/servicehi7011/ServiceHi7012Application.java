package com.yin.servicehi7011;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceHi7012Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHi7012Application.class, args);
    }

}
