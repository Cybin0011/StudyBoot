package com.cybin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cybin.domain.Book;
import com.cybin.mapper.BookMapper;
import com.cybin.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-11-07 10:36
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {
}
