package com.dlut.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
public class webSocketConfig extends AbstractWebSocketMessageBrokerConfigurer
{
    /**
     * 注册stomp协议的节点,并映射到指定的url
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry)
    {
        //注册一个stomp协议的节点(endpoint),并指定使用sockjs协议
        registry.addEndpoint("/endpointWisely").withSockJS();

        //用于点对点的聊天室
        registry.addEndpoint("/endpointChat").withSockJS();
    }

    /**
     * 配置message borker配置消息代理
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry)
    {
        //广播室应该配置一个/topic的代理
        //点对点式应增加一个/queue的代理
        registry.enableSimpleBroker("/topic","/queue");
    }
}
