package com.cybin.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-11-07 9:58
 */
@SpringBootTest
class BookMapperTest2 {
    @Autowired
    BookMapper bookMapper;

    @Test
    void getAllTest(){
        System.out.println(bookMapper.selectList(null));
    }

    @Test
    void updateByIdTest()
    {
        System.out.println("22222222");
    }

}