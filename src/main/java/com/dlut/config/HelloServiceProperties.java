package com.dlut.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 是类型安全的属性获取,在application.properties设置
 */
@Component
@ConfigurationProperties(prefix = "hello")
public class HelloServiceProperties
{
    private static final String MSG = "world";

    private String msg = MSG;

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }
}
