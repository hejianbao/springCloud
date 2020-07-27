package com.example.springclouddemoproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SpringclouddemoProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringclouddemoProductApplication.class, args);
    }
    //当添加@LoadBalanced注解，就代表启动Ribbon,进行负载均衡
  /*  @LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }*/
}
