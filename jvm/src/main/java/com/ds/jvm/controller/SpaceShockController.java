package com.ds.jvm.controller;

import com.ds.jvm.controller.model.MB;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author ds
 * @Date 2021/3/16 17:37
 * @Description 动态扩容引起的空间震荡
 * -XX:+PrintGCDetails -Xms100M -Xmx100M -XX:NewRatio=1 -XX:SurvivorRatio=8
 *  Parallel Scavenge + Serial Old
 *  shenandoah
 *  Epsilon centos
 */

@RestController
public class SpaceShockController {

    public List<MB> list = new LinkedList<MB>();

    @RequestMapping("test")
    public long test(){
       // List<MB> list = new LinkedList<MB>();
        long start = System.currentTimeMillis();
        System.out.println("test--");
        for (int i = 0; i < 10; i++) {
            list.add(new MB());
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    @RequestMapping("test1")
    public String test1(){
        return "OOM后还能正常运行" + list.size();
    }

    @RequestMapping("clear")
    public void clear(){
         list.clear();
    }

}
