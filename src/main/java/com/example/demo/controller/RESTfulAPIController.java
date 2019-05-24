package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.DemoInfo;
import com.example.demo.service.DemoInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Rong.Li
 * @Date: 2019/5/23 17:15
 * @Description:练习restful api
 */
@RestController
public class RESTfulAPIController {
    @Resource
    DemoInfoService service;

    @RequestMapping(value = {"/demo"},method = RequestMethod.POST)
    public List<DemoInfo> addDemoInfo(@ModelAttribute DemoInfo demo){
        System.out.println(JSON.toJSONString(demo));
        return service.insertDemoInfo(demo);
    }

    @RequestMapping(value = {"/demo-requestParam"},method = RequestMethod.POST)
    public  List<DemoInfo> insertDemoInfo(@RequestParam("id") String id,@RequestParam("name") String name,
                                          @RequestParam("description") String description){
        DemoInfo demoInfo = new DemoInfo();
        demoInfo.setId(id);
        demoInfo.setName(name);
        demoInfo.setDescription(description);
        System.out.println(JSON.toJSONString(demoInfo));
        return service.insertDemoInfo(demoInfo);
    }


    @RequestMapping(value = "demo/{id}",method = RequestMethod.GET)
    public DemoInfo findDemoInfo(@PathVariable String id){
        return service.findDemoInfo(id);
    }


    @RequestMapping(value = "demo/{id}",method = RequestMethod.PUT)
    public List<DemoInfo> updateDemoInfo(@PathVariable String id){
        DemoInfo demoInfo = new DemoInfo();
        demoInfo.setId(id);
        demoInfo.setDescription("我是第"+id+"ST");
        demoInfo.setName("ST_"+id);
        return service.updateDemoInfo(demoInfo);
    }


    @RequestMapping(value = "demo/{id}",method = RequestMethod.DELETE)
    public List<DemoInfo> deleteDemoInfo(@PathVariable String id){
        DemoInfo demoInfo = new DemoInfo();
        demoInfo.setId(id);
        return service.deleteDemoInfo(demoInfo);
    }

    @RequestMapping(value = {"demos","/"},method = RequestMethod.GET)
    public List<DemoInfo> findAll(){
        return service.findAll();
    }

}
