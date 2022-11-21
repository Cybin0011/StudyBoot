package com.cybin.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cybin.controller.Utils.ResponseData;
import com.cybin.domain.Book;
import com.cybin.exception.BusinessException;
import com.cybin.exception.SystemException;
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
    @GetMapping("/{id}")
    public ResponseData getOne(@PathVariable Integer id){
        if(id<10)
//            throw new BusinessException("请勿操作<10的数据",501);
            throw new NullPointerException("Null Exception!!!!");
        return new ResponseData().ok().setData(bookService.getById(id));
    }

    @PostMapping
    public ResponseData save(@RequestBody Book book){
        return  bookService.save(book)? new ResponseData().ok():new ResponseData().error();
    }
    @DeleteMapping("/{id}")
    public ResponseData delete(@PathVariable int id){
        if(id<10)
            throw new SystemException("请勿删除<10的数据",501);
        return bookService.removeById(id)?new ResponseData().ok("删除成功."):new ResponseData().error("删除失败.");
    }
    @PutMapping
    public ResponseData update(@RequestBody Book book){
        return  bookService.updateById(book)?new ResponseData().ok():new ResponseData().error();
    }
    @GetMapping("/{current}/{size}")
    public ResponseData getPagination(@PathVariable int current,@PathVariable int size,Book book){

        IPage iPage =bookService.getPage( current,size,book);
        System.out.println("--------------------------------------------");
        System.out.println(iPage);
        if(iPage.getPages()>0&&current>iPage.getPages())
            iPage=bookService.getPage( current,size,book);
        return new ResponseData().ok().setData(iPage);
    }
}
