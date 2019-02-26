package com.dlut.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MqConfig
{
    /**
     * direct
     */
    public static final String QUEUE = "queue_direct";

    @Bean
    public Queue queue()
    {
        return new Queue(QUEUE,true);
    }

    /**
     * topic
     */
    public static final String TOPIC_QUEUE1 = "topic.queue1";
    public static final String TOPIC_QUEUE2 = "topic.queue2";
    public static final String TOPIC_EXCHANGE = "topic_exchange";

    public static final String ROUTING_KEY1 = "topic.key1";
    public static final String ROUTING_KEY2 = "topic.#";


    @Bean
    public Queue topicQueue1()
    {
        return new Queue(TOPIC_QUEUE1,true);
    }

    @Bean
    public Queue topicQueue2()
    {
        return new Queue(TOPIC_QUEUE2,true);
    }

    @Bean
    public TopicExchange topicExchange()
    {
        return new TopicExchange(TOPIC_EXCHANGE);
    }

    @Bean
    public Binding topicBinding1()
    {
        return BindingBuilder.bind(topicQueue1()).to(topicExchange()).with(ROUTING_KEY1);
    }

    @Bean
    public Binding topicBinding2()
    {
        return BindingBuilder.bind(topicQueue2()).to(topicExchange()).with(ROUTING_KEY2);
    }

    /**
     * fanout
     * 转发消息到所有绑定队列，消息广播的模式，不管路由键或者是路由模式，会把消息发给绑定给它的全部队列，如果配置了routing_key会被忽略。
     */
    public static final String FANOUT_EXCHANGE = "fanout_exchange";

    @Bean
    public FanoutExchange fanoutExchange()
    {
        return new FanoutExchange(FANOUT_EXCHANGE);
    }

    @Bean
    public Binding fanoutBinding1()
    {
        return BindingBuilder.bind(topicQueue1()).to(fanoutExchange());
    }

    @Bean
    public Binding fanoutBinding2()
    {
        return BindingBuilder.bind(topicQueue2()).to(fanoutExchange());
    }


    /**
     * Headers Exchange
     */
    public static final String HEADR_EXCHANGE = "head_exchange";

    public static final String HEADR_QUEUE = "head_queue";

    @Bean
    public HeadersExchange headersExchange()
    {
        return new HeadersExchange(HEADR_EXCHANGE);
    }

    @Bean
    public Queue headerQueue()
    {
        return new Queue(HEADR_QUEUE);
    }

    @Bean
    public Binding headerBinding()
    {
        Map<String,Object> map = new HashMap<>();
        map.put("header1","value1");
        map.put("header2","value2");
        return BindingBuilder.bind(headerQueue()).to(headersExchange()).whereAll(map).match();
    }


}
