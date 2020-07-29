package com.example.springclouddemoproduct.mapper;

import com.example.springclouddemoproduct.entity.ConfigService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Classname ProductDao
 * @Description TODO
 * @Date 2020/7/28 0028 16:34
 * @Author hejianbao
 * @Version HL
 */
@Mapper
public interface ProductMapper {
    List<ConfigService> listConfig();
}
