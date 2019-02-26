package com.dlut.rabbitmq.topic;

import com.dlut.rabbitmq.config.MqConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "topicMqSender")
@Slf4j
public class MqSender
{
    @Autowired
    AmqpTemplate amqpTemplate;

    public void sender(Object message)
    {
        String msg = (String)message;
        log.info("send message:" + msg);
        amqpTemplate.convertAndSend(MqConfig.TOPIC_EXCHANGE,"topic.key1",msg + "1");
        amqpTemplate.convertAndSend(MqConfig.TOPIC_EXCHANGE,"topic.key2",msg + "2");
    }
}
