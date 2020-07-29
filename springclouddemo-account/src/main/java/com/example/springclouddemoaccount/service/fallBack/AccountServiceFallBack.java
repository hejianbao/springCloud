package com.example.springclouddemoaccount.service.fallBack;

import com.example.springclouddemoaccount.entity.Account;
import com.example.springclouddemoaccount.service.AccountService;
import org.springframework.stereotype.Component;

/**
 * @Classname AccountServiceFallBack
 * @Description TODO
 * @Date 2020/7/29 0029 10:15
 * @Author hejianbao
 * @Version HL
 */
@Component
public class AccountServiceFallBack implements AccountService {

    @Override
    public Account login(String userName, String password) {
        return new Account();
    }

    @Override
    public boolean signup(String userName, String password) {
        return true;
    }
}
