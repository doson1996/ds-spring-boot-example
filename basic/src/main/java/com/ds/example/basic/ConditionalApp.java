package com.ds.example.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author ds
 * @Date 2021/3/18 23:42
 * @Description
 */
@SpringBootApplication
public class ConditionalApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(ConditionalApp.class, args);

        boolean user02 = run.containsBean("user02");
        System.out.println("容器中有user02：" + user02);

        boolean tom1 = run.containsBean("tom1");
        System.out.println("容器中有tom1：" + tom1);

        boolean tom = run.containsBean("tom");
        System.out.println("容器中有tom：" + tom);

        boolean haha = run.containsBean("haha");
        System.out.println("容器中有haha：" + haha);

        boolean hehe = run.containsBean("hehe");
        System.out.println("容器中有hehe：" + hehe);


    }
}
