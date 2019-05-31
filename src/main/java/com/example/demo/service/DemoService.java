package com.example.demo.service;

import com.example.demo.entity.DemoInfo;

import java.util.List;

/**
 * @Author: Rong.Li
 * @Date: 2019/5/27 16:09
 * @Description:
 */
public interface DemoService {
    void createDemo(DemoInfo demo);
    List<DemoInfo> findAllDemo();
}
