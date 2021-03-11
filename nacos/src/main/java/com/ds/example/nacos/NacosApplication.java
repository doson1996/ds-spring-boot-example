package com.ds.example.nacos;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ds
 * @Date 2021/3/10 11:25
 * @Description nacos spring boot 例子
 */

@SpringBootApplication(scanBasePackages ="com.ds.example")
public class NacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosApplication.class,args);
    }

}
