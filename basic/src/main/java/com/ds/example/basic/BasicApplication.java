package com.ds.example.basic;

import com.ds.example.basic.config.MyConfig;
import com.ds.example.basic.model.Cat;
import com.ds.example.basic.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author ds
 * @Date 2021/3/11 20:05
 * @Description spring boot基础练习
 */

@SpringBootApplication
public class BasicApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(BasicApplication.class, args);

        String[] beanDefinitionNames = run.getBeanDefinitionNames();

        for (String beanDefinitionName : beanDefinitionNames) {
           // System.out.println(beanDefinitionName);
        }



        MyConfig bean = run.getBean(MyConfig.class);
        System.out.println(bean);


        /**
         *  proxyBeanMethods: 代理bean的方法，默认为true,spring boot总会检查组件是否在容器中。   组件为单例
         *                                 设置为false，不会去检查，加快的spring boot的速度。      非单例
         */
        User user1 =   bean.user01();
        User user2 =   bean.user01();
        System.out.println("user = " + user1);
        System.out.println(user1 == user2);

        User user01 = run.getBean("user01", User.class);
        Cat tom = run.getBean("tom", Cat.class);
        System.out.println(user01.getCat() == tom);

        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        System.out.println("----------------");
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

    }

}
