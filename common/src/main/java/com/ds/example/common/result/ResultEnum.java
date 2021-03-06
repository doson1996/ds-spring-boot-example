package com.ds.example.common.result;

/**
 * @Author ds
 * @Date 2021/3/10 16:06
 * @Description
 */
public enum ResultEnum {

    OK(ResultCode.SUCCESS,ResultMsg.SUCCESS_MSG);

    private int code;

    private String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
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
}
