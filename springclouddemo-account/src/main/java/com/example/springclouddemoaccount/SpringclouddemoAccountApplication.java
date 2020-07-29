package com.example.springclouddemoaccount;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
@MapperScan(basePackages = "com.example.springclouddemoaccount.mapper")
public class SpringclouddemoAccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringclouddemoAccountApplication.class, args);
    }

}
