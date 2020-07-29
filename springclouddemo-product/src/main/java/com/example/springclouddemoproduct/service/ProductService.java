package com.example.springclouddemoproduct.service;

import com.example.springclouddemoproduct.entity.ConfigService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname ProductService
 * @Description TODO
 * @Date 2020/7/28 0028 16:31
 * @Author hejianbao
 * @Version HL
 */

public interface ProductService {
    /**
     * @description 获取配置参数
     * @author hejianbao
     * @date 2020/7/28 0028 16:29
     */
    List<ConfigService> getConfig();
}
