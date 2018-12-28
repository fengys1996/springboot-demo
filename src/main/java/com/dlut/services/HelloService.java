package com.dlut.services;

public class HelloService
{
    private String msg;

    public String sayHello()
    {
        return "Hello" + msg;
    }

    public String getMsg() throws Exception
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }
}
