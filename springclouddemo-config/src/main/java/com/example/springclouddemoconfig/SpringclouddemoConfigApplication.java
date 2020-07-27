package com.example.springclouddemoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringclouddemoConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringclouddemoConfigApplication.class, args);
    }

}
