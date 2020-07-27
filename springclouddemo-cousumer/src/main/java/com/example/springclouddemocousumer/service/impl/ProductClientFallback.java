package com.example.springclouddemocousumer.service.impl;

import com.example.springclouddemocousumer.service.ProductClientService;
import org.springframework.stereotype.Component;

/**
 * @Classname ProductClientFallback
 * @Description TODO
 * @Date 2020/7/27 0027 15:31
 * @Author hejianbao
 * @Version HL
 */
@Component
public class ProductClientFallback implements ProductClientService {
    @Override
    public String getProduct() {
        System.out.println("ProductClientFallback中的降级方法");
        //这对gai该接口进行一些逻辑降级处理........
        return "error,请先停止服务";
    }
}
