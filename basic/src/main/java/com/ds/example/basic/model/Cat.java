package com.ds.example.basic.model;

/**
 * @Author ds
 * @Date 2021/3/11 20:22
 * @Description
 */
public class Cat {

    private String name;

    public Cat(){}

    public Cat(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

}
