package com.ds.example.basic.listen;

import com.ds.example.basic.exception.CacheCompletelyBrokenException;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @Author ds
 * @Date 2021/3/30 14:51
 * @Description
 */
@Component
public class LocalCacheVerifier {

    private final ApplicationEventPublisher eventPublisher;

    public LocalCacheVerifier(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    public void checkLocalCache() {
        try {
            //...
            int i = 1 / 0;
        }
        catch (CacheCompletelyBrokenException ex) {
            System.out.println(ex.getMessage());
            AvailabilityChangeEvent.publish(this.eventPublisher, ex, LivenessState.BROKEN);
        }
    }
}
