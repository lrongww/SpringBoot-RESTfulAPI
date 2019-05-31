package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
//设置MapperScan得包路径,com.example.demo.dao下的接口类，在编译之后都会生成相应的实现类。这样就可以省去，单独给每个Mapper上标识@Mapper的麻烦
@MapperScan({"com.example.demo.dao","com.example.demo.mapper"})
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		System.out.println("Let`s inspect the beans provided by Spring Boot:");
		/*String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for(String beanName:beanNames){
			System.out.println(beanName);
		}*/
	}

}
