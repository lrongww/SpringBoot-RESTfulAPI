package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Rong.Li
 * @Date: 2019/5/20 18:12
 */
@RestController
public class DemoController {
    @Value("${name}")
    private String name;

    @RequestMapping(value = "/")
    public String welcome(){
        return name+",welcome to practice Spring Boot Project!";
    }
}
