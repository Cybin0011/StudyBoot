package com.cybin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cybin.mapper")
public class SSMPApplication {

    public static void main(String[] args) {
        SpringApplication.run(SSMPApplication.class, args);
    }

}
