package com.cybin.service;

import com.cybin.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-11-07 10:56
 */
@SpringBootTest
class BookServiceTest {
    @Autowired
    private BookService bookService;
    @Test
    public void getTest(){
        System.out.println(bookService.getById(2));
    }
    @Test
    public void update(){
        Book book=new Book();
        book.setId(23);
        book.setName("地理");
        book.setDescription("地貌特征");
        bookService.updateById(book);
    }

}