package com.ds.common.result;

/**
 * @Author ds
 * @Date 2021/3/10 15:16
 * @Description 返回状态码
 */
public class ResultCode {

    /**
     * 成功
     */
    public static final int SUCCESS = 10000;

    /**
     * 失败
     */
    public static final int FAIL = 20000;

    /**------------------------- 成功返回状态码 10000-19999 -----------------------------------*/

    /**
     * 创建成功
     */
    public static final int CREATE_SUCCESS = 10001;

    /**
     * 删除成功
     */
    public static final int DELETE_SUCCESS = 10002;

    /**
     * 修改成功
     */
    public static final int UPDATE_SUCCESS = 10003;

    /**
     * 查询成功
     */
    public static final int QUERY_SUCCESS = 10004;


    /**------------------------- 失败返回状态码 20001-29999 -----------------------------------*/

    /**
     * 创建失败
     */
    public static final int CREATE_FAIL = 20001;

    /**
     * 删除失败
     */
    public static final int DELETE_FAIL = 20002;

    /**
     * 修改失败
     */
    public static final int UPDATE_FAIL = 20003;

    /**
     * 查询失败
     */
    public static final int QUERY_FAIL = 20004;

    /**
     * 参数错误
     */
    public static final int PARAMETER_ERROR = 20011;


}
