package com.ds.example.basic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ds
 * @Date 2021/3/11 20:06
 * @Description
 */

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        return "hello spring boot";
    }

}
