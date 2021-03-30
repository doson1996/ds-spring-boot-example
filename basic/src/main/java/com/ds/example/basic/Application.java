package com.ds.example.basic;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Author ds
 * @Date 2021/3/30 14:16
 * @Description
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);

       /*
         关闭banner
         SpringApplication application = new SpringApplication(Application.class);
         application.setBannerMode(Banner.Mode.OFF);
         application.run(args);*/

        /*new SpringApplicationBuilder()
                .sources(Application.class)
                .run(args);*/
    }

}
