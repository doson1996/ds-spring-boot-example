package com.ds.example.basic.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author ds
 * @Date 2021/5/6 22:43
 * @Description
 */

@Data
@Component
@ToString
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;

    private List<String> list;
}
