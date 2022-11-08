package com.cybin.controller;


import com.cybin.controller.Utils.ResponseData;
import com.cybin.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-11-07 11:20
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public ResponseData getAll(){
        return new ResponseData().ok().setData(bookService.list());
    }
}
