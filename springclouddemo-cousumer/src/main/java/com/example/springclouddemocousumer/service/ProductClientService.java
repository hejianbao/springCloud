package com.example.springclouddemocousumer.service;

import com.example.springclouddemocousumer.service.impl.ProductClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname ProductService
 * @Description TODO
 * @Date 2020/7/27 0027 10:13
 * @Author hejianbao
 * @Version HL
 */
//name 为product项目中application.yml配置文件中的application.name;
//path 为product项目中application.yml配置文件中的context.path;
@FeignClient(name = "product-services",path ="/product",fallback = ProductClientFallback.class)
//@Componet注解最好加上，不加idea会显示有错误，但是不影响系统运行；
@Component
public interface ProductClientService {
    @RequestMapping(value = "getProduct")
    String getProduct();
}
