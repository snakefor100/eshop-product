package com.junlong.eshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by niujunlong on 18/1/9.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private DataSource dataSource;

    @GetMapping(value = "/t1")
    public String test(){
        return "AA";
    }
}
