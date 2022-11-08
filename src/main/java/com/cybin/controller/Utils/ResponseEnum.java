package com.cybin.controller.Utils;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-11-07 15:36
 */
public enum ResponseEnum {
   SUCCESS(200,"请求成功");
   Integer code;
   String msg;

   private ResponseEnum(Integer code, String msg) {
       this.code=code;
       this.msg=msg;
    }
}
