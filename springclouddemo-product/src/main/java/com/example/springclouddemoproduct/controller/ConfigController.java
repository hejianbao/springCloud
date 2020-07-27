package com.example.springclouddemoproduct.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ConfigController
 * @Description TODO
 * @Date 2020/7/27 0027 17:52
 * @Author hejianbao
 * @Version HL
 */
//测试链接的数据库数据
@RestController
@RequestMapping("/api/v1/product")
public class ConfigController {
    @Value("${item_url}")
    private String url;

    /**
     * 输出url
     */
    @RequestMapping("url")
    public void list(){
        System.out.println(url);
    }
}
