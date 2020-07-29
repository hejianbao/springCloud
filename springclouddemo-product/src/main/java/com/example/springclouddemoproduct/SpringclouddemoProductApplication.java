package com.example.springclouddemoproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
/*@MapperScan(basePackages = "com.example.springclouddemoproduct.mapper")*/
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
