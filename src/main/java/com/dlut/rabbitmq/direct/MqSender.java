package com.dlut.rabbitmq.direct;

import com.dlut.rabbitmq.config.MqConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MqSender
{
    @Autowired
    AmqpTemplate amqpTemplate;

    public void send(Object o)
    {
        String msg = (String) o;
        log.info("send message:" + msg);
        amqpTemplate.convertAndSend(MqConfig.QUEUE,msg);
    }
}
