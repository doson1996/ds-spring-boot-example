package com.ds.mybatis.plus;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author ds
 * @Date 2021/4/23 15:58
 * @Description
 *          @MapperScan -> "com.ds.mybatis.plus.mapper" 一定要写到mapper，
 *         不然会报错org.apache.ibatis.binding.BindingException: ...getBaseMapper
 */

@SpringBootApplication
@MapperScan(value = {"com.ds.mybatis.plus.mapper"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
