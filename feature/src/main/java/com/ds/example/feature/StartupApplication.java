package com.ds.example.feature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.core.metrics.StartupStep;

/**
 * @Author ds
 * @Date 2021/3/30 16:02
 * @Description
 */
@SpringBootApplication
public class StartupApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(StartupApplication.class);
        app.setApplicationStartup(new BufferingApplicationStartup(2048));
        app.run(args);
    }
}
