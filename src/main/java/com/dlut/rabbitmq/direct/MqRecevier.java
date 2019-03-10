package com.dlut.rabbitmq.direct;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MqRecevier
{
    //@RabbitListener(queues = MqConfig.QUEUE)
    public void receive(String msg)
    {
        log.info("receive message:" + msg);
    }
}
