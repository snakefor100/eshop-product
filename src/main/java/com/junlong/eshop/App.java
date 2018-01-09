package com.junlong.eshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 库存服务
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("com.junlong.eshop.dao.mapper")
public class App {
    public static void main( String[] args ){

        SpringApplication.run(App.class, args);
    }
}
