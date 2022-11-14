package com.cybin.controller.Utils;

import com.sun.org.apache.bcel.internal.classfile.Code;
import lombok.Data;

import java.util.HashMap;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-11-07 14:52
 */
@Data
public class ResponseData  {
    private Integer code ;
    private String msg ;
    private Object data;

    public ResponseData() {
    }

    public ResponseData(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseData(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public ResponseData ok(){
        return new ResponseData(200,"success");
    }
    public ResponseData ok(String msg){
        return new ResponseData(200,msg);
    }
    public ResponseData error(){
        return new ResponseData(400,"error");
    }
    public ResponseData error(String msg){
        return new ResponseData(400,msg);
    }
    public ResponseData error(Integer code,String msg){
        return new ResponseData(code,msg);
    }
    public ResponseData setData(Object data)
    {
        this.data=data;
        return this;
    }
}
