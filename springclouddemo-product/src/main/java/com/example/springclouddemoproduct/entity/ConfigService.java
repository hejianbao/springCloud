package com.example.springclouddemoproduct.entity;


import lombok.Data;

import java.io.Serializable;

/**
 * @Classname ConfigService
 * @Description TODO
 * @Date 2020/7/28 0028 17:56
 * @Author hejianbao
 * @Version HL
 */
@Data
public class ConfigService implements Serializable {
    private static final long serialVersionUID = -7867415602508996515L;

    private Integer id;

    private String akey;

    private String avalue;

    private String application;

    private String aprofile;

    private String label;
}
