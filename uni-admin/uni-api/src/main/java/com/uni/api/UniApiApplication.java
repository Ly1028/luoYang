package com.uni.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.uni.api.basic.**.dao")
public class UniApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniApiApplication.class, args);
    }

}
