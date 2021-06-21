package com.ds.contronller;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author ds
 */
@RestController
@RequestMapping("mq")
public class MqController {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @RequestMapping(value = "send")
    public void send(@RequestParam String msg) {
        rocketMQTemplate.convertAndSend("test-topic-1", msg);
       /* rocketMQTemplate.send("test-topic-1", MessageBuilder
                .withPayload("Hello, World! I'm from spring message")
                .build());*/
    }
}
