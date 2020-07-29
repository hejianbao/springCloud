package com.example.springclouddemoaccount.service.impl;
import	java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.springclouddemoaccount.mapper.AccountMapper;
import com.example.springclouddemoaccount.entity.Account;
import com.example.springclouddemoaccount.service.AccountService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Classname AccountServiceImpl
 * @Description TODO
 * @Date 2020/7/29 0029 11:29
 * @Author hejianbao
 * @Version HL
 */
@Service("accountServiceImpl")
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountMapper accountMapper;

    @Override
    public Account login(String userName, String password) {
        Map<String,Object> map = new HashMap<> (2);
        map.put("userName",userName);
        map.put("password",password);
        List<Account> list = accountMapper.selectByExample(map);
        if (CollectionUtils.isNotEmpty(list)) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public boolean signup(String userName, String password) {
        return false;
    }
}
