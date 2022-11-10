package com.cybin.controller;


import com.cybin.controller.Utils.ResponseData;
import com.cybin.domain.Book;
import com.cybin.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

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

    @PostMapping
    public ResponseData save(@RequestBody Book book){
        return  bookService.save(book)? new ResponseData().ok():new ResponseData().error();
    }
    @DeleteMapping("/{id}")
    public ResponseData delete(@PathVariable int id){
        return bookService.removeById(id)?new ResponseData().ok():new ResponseData().error();
    }
    @PutMapping
    public ResponseData update(@RequestBody Book book){
        return  bookService.updateById(book)?new ResponseData().ok():new ResponseData().error();
    }
}
