package com.cybin.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-11-03 16:31
 */
@Data
@TableName("tbl_book")
public class Book {
  private Integer id;
  private String type;
  private String name;
  private String description;
}
