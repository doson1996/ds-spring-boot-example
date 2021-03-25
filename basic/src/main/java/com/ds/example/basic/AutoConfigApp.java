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
 *
 *
 *      • SpringBoot先加载所有的自动配置类  xxxxxAutoConfiguration
 *      • 每个自动配置类按照条件进行生效，默认都会绑定配置文件指定的值。xxxxProperties里面拿。xxxProperties和配置文件进行了绑定
 *      • 生效的配置类就会给容器中装配很多组件
 *      • 只要容器中有这些组件，相当于这些功能就有了
 *      • 定制化配置
 *      • 用户直接自己@Bean替换底层的组件
 *      • 用户去看这个组件是获取的配置文件什么值就去修改。
 *      xxxxxAutoConfiguration ---> 组件  ---> xxxxProperties里面拿值  ----> application.properties
 */
@SpringBootApplication
public class AutoConfigApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(AutoConfigApp.class, args);
        int beanDefinitionCount = run.getBeanDefinitionCount();
        System.out.println("容器中组件数=" + beanDefinitionCount);


    }
}
