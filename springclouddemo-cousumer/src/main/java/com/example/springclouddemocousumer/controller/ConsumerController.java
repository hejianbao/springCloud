package com.example.springclouddemocousumer.controller;

import com.example.springclouddemocousumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ConsumerController
 * @Description TODO
 * @Date 2020/7/27 0027 10:14
 * @Author hejianbao
 * @Version HL
 */
@RestController
public class ConsumerController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "getConsumer")
    public String getConsumer(){
        String str =  productService.getProduct();
        return str;
    }
}
