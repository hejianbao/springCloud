package com.example.springclouddemozuulgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//加上网关注解
@EnableZuulProxy
@SpringBootApplication
public class SpringclouddemoZuulGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringclouddemoZuulGatewayApplication.class, args);
    }

}
