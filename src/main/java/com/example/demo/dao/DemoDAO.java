package com.example.demo.dao;

import com.example.demo.entity.DemoInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: Rong.Li
 * @Date: 2019/5/27 15:56
 * @Description:
 */
public interface DemoDAO {
    void createDemo(@Param("demo") DemoInfo demo);
    List<DemoInfo> findAllDemo();
}
