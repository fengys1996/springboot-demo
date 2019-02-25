package com.dlut.rabbitmq.direct;

import com.dlut.rabbitmq.config.MqConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MqRecevier
{
    @RabbitListener(queues = MqConfig.QUEUE)
    public void receive(String msg)
    {
        log.info("receive message:" + msg);
    }
}
