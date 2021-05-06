package com.ds.example.basic.controller;

import com.ds.example.basic.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ds
 * @Date 2021/5/6 22:54
 * @Description
 */
@RestController
@RequestMapping("person")
public class PersonController {

    @Autowired
    private Person person;

    @RequestMapping("p")
    public Person person() {
        System.out.println(person);
        return person;
    }
}
