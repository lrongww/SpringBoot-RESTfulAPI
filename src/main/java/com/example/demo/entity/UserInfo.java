package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Table;

/**
 * @Author: Rong.Li
 * @Date: 2019/5/28 11:22
 * @Description:
 */

@Data
@Table(name = "t_userinfo")
public class UserInfo {
    private Long id;
    private String name;
    private int age;
    private String pwd;
}


