package com.dlut.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping
public class HelloController
{
    //@Autowired
    private DataSource dataSource;

    @GetMapping("hello")
    //@RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello()
    {
        String s = "123";
        //return "hello,这是我的第一个SpringBoot的程序:" + dataSource;
        return "123";
    }
}
