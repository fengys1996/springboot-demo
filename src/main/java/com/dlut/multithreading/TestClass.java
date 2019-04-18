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

    @RequestMapping("addprint")
    public void addprint(String name)
    {
    }

    /**
     * 该示例演示了ThreadLocal的线程安全
     */
    public final static ThreadLocal<String> tl = new ThreadLocal<>();

    public static class MyThread extends Thread
    {

        public String name;

        MyThread(String name)
        {
            this.name = name;
        }


        @Override
        public void run() {
            tl.set(name);
            System.out.println(name + "has set value");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + ":" + tl.get());
        }
    }

    public static void main(String[] args) {
        for (int i = 0 ; i<5 ; i++ )
        {
            new TestClass.MyThread("" + i).start();
        }
    }

}