package com.dlut.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

//@ConfigurationProperties(prefix = "jdbc")
/**
 * spring boot 不支持下面这种方式读取,他会去application.properties读取
 */
//@PropertySource("classpath:jdbc.properties")
public class JdbcProperties
{
    private String driverClassName;

    private String url;

    private String username;

    private String password;

    public String getDriverClassName()
    {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName)
    {
        this.driverClassName = driverClassName;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
