package com.example.springclouddemoaccount.service;

import com.example.springclouddemoaccount.entity.Account;
import org.springframework.stereotype.Component;

/**
 * @Classname AccountService
 * @Description 负载均衡
 * @Date 2020/7/29 0029 10:11
 * @Author hejianbao
 * @Version HL
 */
//@FeignClient(name = "product-services",path = "/product",fallback = AccountServiceFallBack.class)
public interface AccountService {
//    @RequestMapping(value = "/login")
    Account login(String userName, String password);

//    @RequestMapping(value = "/signup")
    boolean signup(String userName,String password);
}
