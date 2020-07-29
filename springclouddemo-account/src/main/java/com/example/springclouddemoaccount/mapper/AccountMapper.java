package com.example.springclouddemoaccount.mapper;

import com.example.springclouddemoaccount.entity.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Classname AccountMapper
 * @Description
 * @Date 2020/7/29 0029 10:44
 * @Author hejianbao
 * @Version HL
 */
@Mapper
public interface AccountMapper {
    /**
     * 根据条件查询列表
     *
     * @param map
     */
    List<Account> selectByExample(Map<String,Object> map);


    /**
     * 根据主键删除数据库的记录
     *
     * @param tid
     */
    int deleteByPrimaryKey(String tid);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(Account record);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insertSelective(Account record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param tid
     */
    Account selectByPrimaryKey(String tid);

    /**
     * 根据主键来更新部分数据库记录
     *
     * @param record
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(Account record);
}
