package com.dlut.rabbitmq.header;

import com.dlut.rabbitmq.config.MqConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 设置header attribute参数类型的交换机，相较于 direct 和 topic 固定地使用 routing_key ,
 * headers 则是一个自定义匹配规则的类型. 在队列与交换器绑定时, 会设定一组键值对规则,
 * 消息中也包括一组键值对( headers 属性), 当这些键值对有一对, 或全部匹配时, 消息被投送到对应队列.
 */
@Service(value = "headerMqSender")
@Slf4j
public class MqSender
{
    @Autowired
    AmqpTemplate amqpTemplate;

    public void sender(Object o)
    {
        String strMsg = (String)o;
        log.info("send message:" + strMsg);
        MessageProperties properties = new MessageProperties();
        properties.setHeader("header1","value1");
        properties.setHeader("header2","value2");
        Message msg = new Message(strMsg.getBytes(),properties);
        amqpTemplate.convertAndSend(MqConfig.HEADR_EXCHANGE,"",msg);
    }
}
