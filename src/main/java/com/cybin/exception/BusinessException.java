package com.cybin.exception;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-11-10 16:54
 */
public class BusinessException  extends  RuntimeException{


    private  Integer code;


    public BusinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public BusinessException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

}
