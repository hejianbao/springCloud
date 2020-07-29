package com.example.springclouddemoaccount.controller;

import com.example.springclouddemoaccount.entity.Account;
import com.example.springclouddemoaccount.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Classname AccountController
 * @Description 进如登入页面
 * @Date 2020/7/29 0029 10:07
 * @Author hejianbao
 * @Version HL
 */
@RestController
public class AccountController {
    @Autowired
    @Qualifier("accountServiceImpl")
    private AccountService accountService;

    /**
     * @description 登录
     * @author hejianbao
     * @date 2020/7/29 0029 10:16
     * @param
     * @return
     * @throws
     */
    @RequestMapping(value = "/login")
    public Account login(@RequestParam(value = "userName") String userName, @RequestParam(value = "password") String password) {
        Account result = accountService.login(userName,password);
        return result;
    }


    /**
     * 注册
     *
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public String signup(String userName, String password) {
        boolean result = accountService.signup(userName, password);
        return result ? "true" : "false";
    }
}
