package com.ds.example.basic.config;

import com.ds.example.basic.model.Cat;
import com.ds.example.basic.model.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author ds
 * @Date 2021/3/18 23:44
 * @Description
 */

@Configuration
@ConditionalOnBean(value = {MyConfig.class}) //当存在MyConfig.class的时候才把ConditionalConfig注入到容器中
//@ConditionalOnMissingBean(value = {MyConfig.class})
@ImportResource(value = {"classpath:beans.xml"})
public class ConditionalConfig {

    @Bean
   // @ConditionalOnBean(name = "tom1")  //当存在tom1组件的时候才注入到容器中
    public User user02(){
        User user = new User("张三", 20);
        return user;
    }


    @Bean("tom1")
    public Cat tom1(){
        return new Cat("tom");
    }
}
