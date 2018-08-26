package com.jarrell.springboot.jdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value="com.jarrell.springboot.jdbc.dao")
@SpringBootApplication
public class SpringbootJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJdbcApplication.class, args);
    }
}
