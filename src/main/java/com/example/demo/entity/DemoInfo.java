package com.example.demo.entity;

import java.io.Serializable;

/**
 * @Author: Rong.Li
 * @Date: 2019/5/23 17:30
 * @Description:
 */
public class DemoInfo implements Serializable {
    private String id;
    private String name;
    private String description;
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

}
