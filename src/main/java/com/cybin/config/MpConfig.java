package com.cybin.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Chen Yuanbin
 * @description TODO
 * @create 2022-11-04 10:19
 */
@Configuration
public class MpConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor Interceptor = new MybatisPlusInterceptor();
        Interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return Interceptor;
    }
}
