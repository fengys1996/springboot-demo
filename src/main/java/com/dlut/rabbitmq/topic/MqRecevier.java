package com.dlut.rabbitmq.topic;

import com.dlut.rabbitmq.config.MqConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service(value = "topicMqRecevier")
@Slf4j
public class MqRecevier
{
    @RabbitListener(queues = MqConfig.TOPIC_QUEUE1)
    public void rece1(String msg)
    {
        log.info("receive1 msg:" + msg);
    }

    @RabbitListener(queues = MqConfig.TOPIC_QUEUE2)
    public void rece2(String msg)
    {
        log.info("receive2 msg:" + msg);
    }

}
