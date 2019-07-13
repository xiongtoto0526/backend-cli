package com.company.business;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.neko.seed"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}