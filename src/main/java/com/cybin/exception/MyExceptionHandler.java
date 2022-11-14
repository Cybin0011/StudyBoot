package com.cybin.exception;

import com.cybin.controller.Utils.ResponseData;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-11-10 16:00
 */
@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseData handleBusinessException(BusinessException ex){
        ex.printStackTrace();
        return new ResponseData(ex.getCode(),ex.getMessage(),null);
    }

    @ExceptionHandler(SystemException.class)
    public ResponseData handleSystemException(SystemException ex){
        ex.printStackTrace();
        return new ResponseData(ex.getCode(),ex.getMessage(),null);
    }

    @ExceptionHandler(Exception.class)
    public ResponseData handleException(Exception ex){
        ex.printStackTrace();
        return new ResponseData(500,"服务器异常",null);
    }




}
