package com.dlut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.sql.DataSource;

@Controller
public class ThymeleafController
{
    /**
     * 测试thymeleaf的controller
     */
    @RequestMapping(value = "/greeting")
    public ModelAndView greeting(ModelAndView mv)
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        mv.setViewName("/greeting");
        mv.addObject("title","欢迎使用Thymeleaf");
        return mv;
    }
}
