package com.cybin.exception;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-11-10 16:54
 */
public class SystemException extends  RuntimeException{


    private  Integer code;


    public SystemException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public SystemException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }
    
    public Integer getCode() {
        return code;
    }

}
