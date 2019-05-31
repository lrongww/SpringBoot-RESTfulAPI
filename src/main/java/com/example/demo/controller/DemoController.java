package com.example.demo.controller;

import com.example.demo.entity.DemoInfo;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Rong.Li
 * @Date: 2019/5/20 18:12
 */
@RestController
public class DemoController {
    @Resource
    DemoService demoService;
    @Value("${name}")
    private String name;

    @RequestMapping(value = "/")
    public String welcome(){
        return name+",welcome to practice Spring Boot Project!";
    }

    @RequestMapping(value = "/user/userList",method = RequestMethod.GET)
    public List<DemoInfo> getDemoList(){
        return  demoService.findAllDemo();
    }

    @RequestMapping(value = "/user/add",method =RequestMethod.POST )
    public String addDemo(@ModelAttribute DemoInfo demoInfo){
        if (demoInfo!=null){
            demoService.createDemo(demoInfo);
            return "success";
        }else{
            return "error";
        }
    }

}
