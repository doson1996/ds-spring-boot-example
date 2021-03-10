package com.ds.example.nacos.easyexcel.model;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.write.style.ColumnWidth;
import com.alibaba.excel.annotation.write.style.ContentRowHeight;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;

import java.util.Date;

/**
 * @Author ds
 * @Date 2021/3/4 17:35
 * @Version 1.0
 * @Description
 */

@ContentRowHeight(10)
@HeadRowHeight(20)
@ColumnWidth(25)
public class DemoData {

    @ExcelProperty("字符串标题")
    private String string;

    @ExcelProperty("日期标题")
    private Date date;

    @ExcelProperty("问题")
    private String question;

    @ExcelProperty("数字标题")
    private Double doubleData;

    public DemoData() {
    }

    public DemoData(String string, Date date, Double doubleData, String question) {
        this.string = string;
        this.date = date;
        this.doubleData = doubleData;
        this.question = question;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getDoubleData() {
        return doubleData;
    }

    public void setDoubleData(Double doubleData) {
        this.doubleData = doubleData;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

}

