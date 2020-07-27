package com.example.springclouddemoproduct.controller;

import com.example.springclouddemoentity.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ProductController
 * @Description TODO
 * @Date 2020/7/27 0027 10:00
 * @Author hejianbao
 * @Version HL
 */
@RestController
public class ProductController {
    @RequestMapping(value = "getProduct")
    public String getProduct() {
        Product product = new Product();
        return product.toString();
    }
}
