package com.ds.example.easyexcle.model;

import com.alibaba.excel.annotation.ExcelProperty;

import java.util.Date;

/**
 * @Auther: ds
 * @Date: 2021/03/03 11:45
 * @Description:
 */
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

