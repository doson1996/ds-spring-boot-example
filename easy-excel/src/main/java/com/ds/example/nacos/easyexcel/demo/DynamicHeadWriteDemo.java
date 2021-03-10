package com.ds.example.nacos.easyexcel.demo;

import com.alibaba.excel.EasyExcel;
import com.ds.example.nacos.easyexcel.model.DemoData;
import com.ds.example.nacos.easyexcel.utils.FileUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author ds
 * @Date 2021/3/4 17:35
 * @Version 1.0
 * @Description
 */

public class DynamicHeadWriteDemo {

    public static void main(String[] args) {
        dynamicHeadWrite();
    }

    private static List<List<String>> head() {
        List<List<String>> list = new ArrayList<>();
        List<String> head0 = new ArrayList<>();
        head0.add("字符串");
        List<String> head1 = new ArrayList<>();
        head1.add("数字");
        List<String> head2 = new ArrayList<>();
        head2.add("日期");
        list.add(head0);
        list.add(head1);
        list.add(head2);
        return list;
    }

    public static void dynamicHeadWrite() {
        String fileName = FileUtil.getPath() + "dynamicHeadWrite" + ".xlsx";
        EasyExcel.write(fileName)
                // 这里放入动态头
                .head(head()).sheet("模板")
                // 当然这里数据也可以用 List<List<String>> 去传入
                .doWrite(data());
    }

    private static List<DemoData> data() {
        List<DemoData> list = new ArrayList<DemoData>();
        for (int i = 0; i < 10; i++) {
            DemoData data = new DemoData();
            data.setString("字符串" + i);
            data.setDate(new Date());
            data.setDoubleData(0.56);
            list.add(data);
        }
        return list;
    }
}
