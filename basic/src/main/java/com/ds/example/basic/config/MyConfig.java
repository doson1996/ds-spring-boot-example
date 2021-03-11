package com.ds.example.basic.config;

import com.ds.example.basic.model.Cat;
import com.ds.example.basic.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author ds
 * @Date 2021/3/11 20:17
 * @Description
 *
 *      代理bean的方法
 *      proxyBeanMethods: 默认为true,每次获取组件spring都会验证组件在容器中是否已经创建。   组件为单例，解决组件依赖   配置类组件之间有依赖关系，方法会被调用得到之前单实例组件，用Full模式
 *                        设置为false，不会去验证，加快spring boot的运行速度。           非单例                 配置类组件之间无依赖关系用Lite模式加速容器启动过程，减少判断
 *
 */

@Configuration(proxyBeanMethods = true)
public class MyConfig {

    /**
     * 1.方法名为组件的id
     * 2.返回类型为组件的类型
     * 3.返回的值就是组件在容器中的实例
     * @return
     */
    @Bean
    public User user01(){
        User user = new User("张三", 20);
        user.setCat(tom());
        return user;
    }


    @Bean("tom")
    public Cat tom(){
        return new Cat("tom");
    }

}
