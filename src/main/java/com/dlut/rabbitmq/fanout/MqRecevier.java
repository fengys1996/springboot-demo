package com.dlut.rabbitmq.fanout;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service(value = "fanoutMqRecevier")
@Slf4j
public class MqRecevier
{
    //@RabbitListener(queues = MqConfig.TOPIC_QUEUE1)
    public void rece1(String msg)
    {
        log.info("receive1 msg:" + msg);
    }

    //@RabbitListener(queues = MqConfig.TOPIC_QUEUE2)
    public void rece2(String msg)
    {
        log.info("receive2 msg:" + msg);
    }

}
