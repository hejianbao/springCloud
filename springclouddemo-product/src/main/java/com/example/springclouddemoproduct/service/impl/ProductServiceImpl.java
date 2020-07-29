package com.example.springclouddemoproduct.service.impl;

import com.example.springclouddemoproduct.entity.ConfigService;
import com.example.springclouddemoproduct.mapper.ProductMapper;
import com.example.springclouddemoproduct.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname ProductServiceImpl
 * @Description TODO
 * @Date 2020/7/28 0028 16:33
 * @Author hejianbao
 * @Version HL
 */
@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;
    @Override
    public List<ConfigService> getConfig() {
        return  productMapper.listConfig();
    }
}
