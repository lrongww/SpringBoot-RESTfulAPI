package com.example.demo.service;

import com.example.demo.entity.DemoInfo;

import java.util.List;

/**
 * @Author: Rong.Li
 * @Date: 2019/5/23 17:59
 * @Description:
 */
public interface DemoInfoService {
    List<DemoInfo> insertDemoInfo(DemoInfo demo);
    DemoInfo findDemoInfo(String id);
    List<DemoInfo> updateDemoInfo(DemoInfo demo);
    List<DemoInfo> deleteDemoInfo(DemoInfo demo);
    List<DemoInfo>findAll();
}
