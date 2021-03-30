package com.ds.example.feature;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @Author ds
 * @Date 2021/3/30 15:46
 * @Description
 */
@SpringBootApplication
public class ExitCodeApplication {

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        System.out.println("exitCodeGenerator...");
        return () -> 42;
    }

    public static void main(String[] args) {
        int exit = SpringApplication.exit(SpringApplication.run(ExitCodeApplication.class, args));
        System.out.println("exit = " + exit);
        System.exit(exit);
    }
}
