package com.dlut.rabbitmq.direct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqController
{
    @Autowired
    MqSender mqSender;

    @Autowired
    MqRecevier mqRecevier;

    String msg = "Hello,direct";

    @RequestMapping(value = "send")
    public void send()
    {
        mqSender.send(msg);
    }

    @RequestMapping(value = "rece")
    public void rece()
    {
        String msg = "";
        mqRecevier.receive(msg);
    }
}
