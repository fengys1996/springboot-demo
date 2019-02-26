package com.dlut.rabbitmq.direct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/direct")
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
}
