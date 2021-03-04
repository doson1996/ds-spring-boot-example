package com.ds.example.easyexcel.demo;

import com.alibaba.excel.EasyExcel;
import com.ds.example.easyexcel.model.DemoData;
import com.ds.example.easyexcel.model.DemoDataList;
import com.ds.example.easyexcel.utils.FileUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Auther: ds
 * @Date: 2021/03/03 11:45
 * @Description:
 */
public class SimpleWriteDemo {

    public static void main(String[] args) {
        System.out.println("E:\\excel");
        List<DemoData> data = data();
        simpleWrite(data);
    }

    private static List<DemoData> data() {
        List<DemoData> list = new ArrayList<DemoData>();
        for (int i = 0; i < 10; i++) {
            DemoData data = new DemoData();
            data.setString("字符串" + i);
            data.setDate(new Date());
            data.setDoubleData(0.56);
            List<DemoDataList> dataList = dataList();
            //data.setList(dataList);
            StringBuffer sb = new StringBuffer();
            for (DemoDataList demoDataList : dataList) {
                sb.append(demoDataList.getStr()).append("; ");
            }
            data.setQuestion(sb.toString());
            list.add(data);
        }
        return list;
    }

    public static List<DemoDataList> dataList(){
        List<DemoDataList> dataList = new ArrayList<DemoDataList>();
        for (int i = 0; i < 3; i++) {
            DemoDataList demoDataList1 = new DemoDataList("问题1大手大脚挥洒的接口和萨迪克撒谎的卡萨大手大脚挥洒的接口和萨迪克撒谎的卡萨" + i);
            DemoDataList demoDataList2 = new DemoDataList("问题2大手大脚挥洒的接口和萨迪克撒谎的卡萨大手大脚挥洒的接口和萨迪克撒谎的卡萨" + i);
            DemoDataList demoDataList3 = new DemoDataList("问题3大手大脚挥洒的接口和萨迪克撒谎的卡萨大手大脚挥洒的接口和萨迪克撒谎的卡萨" + i);
            dataList.add(demoDataList1);
            dataList.add(demoDataList2);
            dataList.add(demoDataList3);
        }
        return dataList;
    }

    /**
     *
     * @param data
     */
    public static void simpleWrite(List<DemoData> data) {
        // 写法1
        String fileName = FileUtil.getPath() + "simpleWrite" + System.currentTimeMillis() + ".xlsx";
        // 这里 需要指定写用哪个class去写，然后写到第一个sheet，名字为模板 然后文件流会自动关闭
        // 如果这里想使用03 则 传入excelType参数即可
        EasyExcel.write(fileName, DemoData.class).sheet("模板").doWrite(data);

        // 写法2
       /* fileName = FileUtil.getPath() + "simpleWrite" + System.currentTimeMillis() + ".xlsx";
        // 这里 需要指定写用哪个class去写
        ExcelWriter excelWriter = null;
        try {
            excelWriter = EasyExcel.write(fileName, DemoData.class).build();
            WriteSheet writeSheet = EasyExcel.writerSheet("模板").build();
            excelWriter.write(data(), writeSheet);
        } finally {
            // 千万别忘记finish 会帮忙关闭流
            if (excelWriter != null) {
                excelWriter.finish();
            }
        }*/
    }


}
