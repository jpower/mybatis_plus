package com.wmh.mybatis_plus;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class MybatisPlusApplication {
    public void fun1(){
        System.out.println("大SB22222");
    }

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
        System.out.println("sdf");
        System.out.println("hot-fix");
        System.out.println("sb123123");
        System.out.println("大SB1");
    }

}
