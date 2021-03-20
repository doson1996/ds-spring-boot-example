package com.ds.example.basic.controller;

import com.ds.example.basic.model.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ds
 * @Date 2021/3/11 20:06
 * @Description
 */

@RestController
public class HelloController {

    @Autowired
    private MyProperties myProperties;

    @RequestMapping("hello")
    public String hello(){
        return "hello spring boot";
    }

    @RequestMapping("MyProperties")
    public MyProperties MyProperties(){
        return myProperties;
    }



}
