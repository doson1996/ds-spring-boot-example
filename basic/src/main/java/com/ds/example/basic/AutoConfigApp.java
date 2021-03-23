package com.ds.example.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author ds
 * @Date 2021/3/23 23:43
 * @Description 自动配置
 *      1、利用getAutoConfigurationEntry(annotationMetadata);给容器中批量导入一些组件
 *      2、调用List<String> configurations = getCandidateConfigurations(annotationMetadata, attributes)获取到所有需要导入到容器中的配置类
 *      3、利用工厂加载 Map<String, List<String>> loadSpringFactories(@Nullable ClassLoader classLoader)；得到所有的组件
 *      4、从META-INF/spring.factories位置来加载一个文件。
 *      默认扫描我们当前系统里面所有META-INF/spring.factories位置的文件
 *     spring-boot-autoconfigure-2.3.4.RELEASE.jar包里面也有META-INF/spring.factories
 */
@SpringBootApplication
public class AutoConfigApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(AutoConfigApp.class, args);
        int beanDefinitionCount = run.getBeanDefinitionCount();
        System.out.println("容器中组件数=" + beanDefinitionCount);


    }
}
