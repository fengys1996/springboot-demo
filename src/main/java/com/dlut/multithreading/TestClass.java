package com.dlut.multithreading;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestClass
{
    //回去测试一下threadlocal
    private int a = 0;
    @RequestMapping
    public void print(String name)
    {
        for(int i=0 ; i<10 ; i++)
        {
            a++;
            System.out.println(name + ":" + a);
            try
            {
                Thread.sleep(300);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

}
