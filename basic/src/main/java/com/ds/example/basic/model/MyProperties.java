package com.ds.example.basic.model;

import com.ds.example.basic.config.PropertiesConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author ds
 * @Date 2021/3/20 20:02
 * @Description 第二种方式： {@link PropertiesConfig}
 */

@Component
@ConfigurationProperties(prefix = "myproperties")
public class MyProperties {

    private String name;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MyProperties{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
