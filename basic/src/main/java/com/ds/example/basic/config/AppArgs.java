package com.ds.example.basic.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author ds
 * @Date 2021/3/30 15:30
 * @Description 获取应用程序参数
 */
@Component
public class AppArgs {

    @Autowired
    public void MyBean(ApplicationArguments args) {
        boolean debug = args.containsOption("debug");
        List<String> files = args.getNonOptionArgs();
        // if run with "--debug logfile.txt" debug=true, files=["logfile.txt"]
        System.out.println("files = " + files);
    }
}
