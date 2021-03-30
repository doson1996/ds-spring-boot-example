package com.ds.example.basic.listen;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author ds
 * @Date 2021/3/30 15:08
 * @Description     应用程序事件和侦听器
 *      1、ApplicationStartingEvent 在运行开始的时候发送事件
 *      2、ApplicationEnvironmentPreparedEvent 当Environment在上下文中被使用的时候发送事件
 *      3、ApplicationContextInitializedEvent 在所有的bean定义前，ApplicationContext准备好并且ApplicationContextInitializers已经被调用的时候发送事件
 *      4、ApplicationPreparedEvent 刷新配置前、bean的定义加载之后发送事件
 *      5、ApplicationStartedEvent 刷新上下文后，在执行CommandLineRunner的实现之前
 *      6、AvailabilityChangeEvent 发送LivenessState.CORRECT 表面应用是活跃状态
 *      7、ApplicationReadyEvent 在执行CommandLineRunner接口之后发送
 *      8、AvailabilityChangeEvent 发送ReadinessState.ACCEPTING_TRAFFIC 后代表应用可以接入流量
 *      9、ApplicationFailedEvent 发送应用启动失败事件
 */
//@Component
public class MyListener implements ApplicationListener<ApplicationEvent> {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println(applicationEvent);
    }
}
