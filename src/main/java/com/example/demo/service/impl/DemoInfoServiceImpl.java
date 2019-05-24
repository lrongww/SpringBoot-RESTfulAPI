package com.example.demo.service.impl;

import com.example.demo.dao.DemoInfoDAO;
import com.example.demo.entity.DemoInfo;
import com.example.demo.service.DemoInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Rong.Li
 * @Date: 2019/5/23 18:06
 * @Description:
 */
@Service
public class DemoInfoServiceImpl implements DemoInfoService {
    @Resource
    DemoInfoDAO dao;

    @Override
    public List<DemoInfo> insertDemoInfo(DemoInfo demo) {
        return dao.insertDemoInfo(demo);
    }

    @Override
    public DemoInfo findDemoInfo(String id) {
        return dao.findDemoInfo(id);
    }

    @Override
    public List<DemoInfo> updateDemoInfo(DemoInfo demo) {
        return dao.updateDemoInfo(demo);
    }

    @Override
    public List<DemoInfo> deleteDemoInfo(DemoInfo demo) {
        return dao.deleteDemoInfo(demo);
    }

    @Override
    public List<DemoInfo> findAll() {

        return dao.findAll();
    }
}
