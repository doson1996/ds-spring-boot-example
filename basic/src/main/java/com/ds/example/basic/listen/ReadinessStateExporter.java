package com.ds.example.basic.listen;

import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author ds
 * @Date 2021/3/30 14:43
 * @Description 通过注入ApplicationAvailability接口并在其上调用方法，应用程序组件可以随时检索当前的可用性状态。
 *              应用程序通常会希望侦听状态更新或更新应用程序的状态。
 */
@Component
public class ReadinessStateExporter {

    @EventListener
    public void onStateChange(AvailabilityChangeEvent<ReadinessState> event) {
        switch (event.getState()) {
            case ACCEPTING_TRAFFIC:
                // create file /tmp/healthy
                System.out.println("该应用程序已准备就绪，可以接收流量");
                break;
            case REFUSING_TRAFFIC:
                // remove file /tmp/healthy
                System.out.println("该应用程序不愿意接收流量。");
                break;
        }
    }

}
