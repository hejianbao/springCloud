package com.example.springclouddemocousumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//添加熔断降级注解
@EnableCircuitBreaker
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SpringclouddemoCousumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringclouddemoCousumerApplication.class, args);
    }

}

