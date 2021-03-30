package com.ds.example.basic.listen;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author ds
 * @Date 2021/3/30 15:37
 * @Description 启动之前
 *      如果定义了多个CommandLineRunner或ApplicationRunner必须按特定顺序调用的bean，
 *      则可以额外实现org.springframework.core.Ordered接口或使用org.springframework.core.annotation.Order批注。
 */
@Component
public class BeforeStart implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        StringBuilder sb = new StringBuilder("应用程序启动之前 args =");
        for (String arg : args) {
            sb.append(arg);
        }
        System.out.println(sb);
    }
}
