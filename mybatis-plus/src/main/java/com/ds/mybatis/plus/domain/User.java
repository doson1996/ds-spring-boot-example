package com.ds.mybatis.plus.domain;

import lombok.Data;

/**
 * @Author ds
 * @Date 2021/4/23 16:11
 * @Description
 */
@Data
public class User {

    private Long id;

    private String name;

    private String password;

    private String email;
}
