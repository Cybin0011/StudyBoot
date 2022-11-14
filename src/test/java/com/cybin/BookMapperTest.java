package com.cybin;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cybin.domain.Book;
import com.cybin.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BookMapperTest {
    @Autowired
    private BookMapper bookMapper;
    @Test
    void mapperTest(){
        System.out.println(bookMapper.selectById(10));
    }
    @Test
    void insertTest()
    {
        Book history=new Book();
        history.setType("基础教育");
        history.setName("历史全览");
        history.setDescription("增加历史知识");
        bookMapper.insert(history);

    }
 
    @Test
    void getPage()
    {
        IPage page=new Page(1,10);
        IPage iPage = bookMapper.selectPage(page, null);
        for (Object record : iPage.getRecords()) {
            System.out.println(record);
        }
    }



}
