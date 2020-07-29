package com.example.springclouddemocousumer.controller;

import com.example.springclouddemocousumer.service.ProductClientService;
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
    private ProductClientService productClientService;

    @RequestMapping(value = "getConsumer")
    public String getConsumer(){
        String str =  productClientService.getProduct();
        return str;
    }

    /**
     * @description 获取表中数据
     * @author hejianbao
     * @date 2020/7/28 0028 16:25
     * @param
     * @return
     * @throws
     */
    @RequestMapping(value = "getConfig")
    public String getConfig() {
        String str = productClientService.getConfig();
        return str;
    }
}
