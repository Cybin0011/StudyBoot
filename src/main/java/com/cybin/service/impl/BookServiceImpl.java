package com.cybin.service.impl;

import com.baomidou.mybatisplus.core.conditions.AbstractWrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cybin.domain.Book;
import com.cybin.mapper.BookMapper;
import com.cybin.service.BookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-11-07 10:36
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
    @Autowired
    BookMapper bookMapper;
    @Override
    public IPage getPage(int current, int size, Book book) {
        LambdaQueryWrapper lwp=new LambdaQueryWrapper<Book>()
                .like(Strings.isNotEmpty(book.getType()), Book::getType, book.getType())
                .like(Strings.isNotEmpty(book.getName()), Book::getName, book.getName())
                .like(Strings.isNotEmpty(book.getDescription()), Book::getDescription, book.getDescription());
        Page page = bookMapper.selectPage(new Page<>(current, size), lwp);
        return page;
    }
}
