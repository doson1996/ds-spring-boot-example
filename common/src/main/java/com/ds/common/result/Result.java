package com.ds.common.result;

/**
 * @Author ds
 * @Date 2021/3/10 15:17
 * @Description rest返回
 */
public class Result<T> {

    private int code;

    private String message;

    private T data;

    public Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * @return 成功返回
     */
    public static <T> Result<T> ok(){
        return new Result<T>(ResultCode.SUCCESS, ResultMsg.SUCCESS_MSG, null);
    }

    /**
     * @param message 消息
     * @return 带指定消息的成功返回
     */
    public static <T> Result<T> ok(String message){
        return new Result<T>(ResultCode.SUCCESS, message, null);
    }

    /**
     * @param message 消息
     * @param data    数据
     * @return 带指定消息和数据的成功返回
     */
    public static <T> Result<T> ok(String message,T data){
        return new Result<T>(ResultCode.SUCCESS, message, data);
    }

    /**
     * @return 失败返回
     */
    public static <T> Result<T> fail(){
        return new Result<T>(ResultCode.FAIL, ResultMsg.FAIL_MSG, null);
    }

    /**
     * @param message 消息
     * @return 带指定消息的失败返回
     */
    public static <T> Result<T> fail(String message){
        return new Result<T>(ResultCode.FAIL, message, null);
    }

    /**
     * @param message 消息
     * @param data    数据
     * @return 带指定消息和数据的失败返回
     */
    public static <T> Result<T> fail(String message,T data){
        return new Result<T>(ResultCode.FAIL, message, data);
    }



    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
