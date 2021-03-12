package com.ds.common.util;

import org.springframework.util.StringUtils;

/**
 * @Author ds
 * @Date 2021/3/10 17:08
 * @Description 字符串工具类
 */
public class StringUtil {

    /**
     * 禁止实例化此类
     */
    private StringUtil(){}

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        return str == null || str.length() == 0;
    }

    /**
     * 判断字符串是否不为空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }



    public static void main(String[] args) {
        //StringUtils.isEmpty()
        String s = "";
        System.out.println(StringUtil.isEmpty(s));
        System.out.println(StringUtil.isNotEmpty(s));
    }

}
