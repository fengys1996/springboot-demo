package com.dlut.rabbitmq.fanout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller(value = "fanoutController")
@RequestMapping("/fanout")
public class MqController
{
    @Autowired
    MqSender mqSender;

    @Autowired
    MqRecevier mqRecevier;

    @ResponseBody
    @RequestMapping("/send")
    public void send()
    {
        String msg = "Hello,topic!!";
        mqSender.sender(msg);
    }
}
