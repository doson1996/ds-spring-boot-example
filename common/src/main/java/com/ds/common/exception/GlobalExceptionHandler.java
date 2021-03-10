package com.ds.common.exception;

import com.ds.common.result.Result;
import com.ds.common.result.ResultMsg;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author ds
 * @Date 2021/3/10 16:23
 * @Description 全局异常处理
 */

@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 系统异常捕获
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result ExceptionHandler(Exception e){
        return new Result(HttpStatus.INTERNAL_SERVER_ERROR.value(),HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),null);
    }

    /**
     * 参数异常捕获
     * @param e
     * @return
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public Result IllegalArgumentExceptionHandler(Exception e){
        return Result.fail(ResultMsg.PARAMETER_ERROR_MSG);
    }



}
