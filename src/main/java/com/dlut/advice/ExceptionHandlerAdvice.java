package com.dlut.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * 我也不知:在这里不起作用,应该是被默认的Exception给处理掉了
 */
//@ControllerAdvice
public class ExceptionHandlerAdvice
{
    //@ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request)
    {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage",exception.getMessage());
        return modelAndView;
    }
}
