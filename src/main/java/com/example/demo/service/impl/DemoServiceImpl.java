package com.example.demo.service.impl;

import com.example.demo.dao.DemoDAO;
import com.example.demo.entity.DemoInfo;
import com.example.demo.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

/**
 * @Author: Rong.Li
 * @Date: 2019/5/27 16:11
 * @Description:
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Resource
    DemoDAO demoDAO;

    @Override
    public void createDemo(DemoInfo demo) {
        demoDAO.createDemo(demo);
    }

    @Override
    public List<DemoInfo> findAllDemo() {
        /*DemoInfo demoInfo = new DemoInfo();
        demoInfo.setName("hello");
        demoInfo.setDescription("test");
        demoDAO.createDemo(demoInfo);*/

        return demoDAO.findAllDemo();
    }
}
