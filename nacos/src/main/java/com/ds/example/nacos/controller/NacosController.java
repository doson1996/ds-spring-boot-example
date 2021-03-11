package com.ds.example.nacos.controller;

import com.ds.example.common.result.Result;
import com.ds.example.common.result.ResultMsg;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ds
 * @Date 2021/3/11 10:08
 * @Description
 */
@RestController
@RequestMapping("nacos")
public class NacosController {

    @GetMapping("echo")
    public Result echo(@RequestParam String msg){

        if(StringUtils.isEmpty(msg)){
            throw new IllegalArgumentException();
        }

        return Result.ok(msg);
    }
}
