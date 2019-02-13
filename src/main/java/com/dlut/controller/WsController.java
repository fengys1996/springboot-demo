package com.dlut.controller;

import com.dlut.domain.WiselyMessage;
import com.dlut.domain.WiselyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * websocket演示
 */
@Controller
public class WsController
{
    /**
     * @MessageMapping:当浏览器向服务器发送请求时,映射这个地址
     * @SendTo:当服务器有消息时,会对订阅了该路径的浏览器发送消息
     */
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public WiselyResponse say(WiselyMessage msg) throws InterruptedException
    {
        Thread.sleep(3000);
        return new WiselyResponse("Welcome," + msg.getName() + "!");
    }

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    /**
     *
     */
    @MessageMapping("/chat")
    public void handleChat(Principal principal,String msg)
    {
        if(principal.getName().equals("wyf"))
        {
            simpMessagingTemplate.convertAndSendToUser("wisely","/queue/notifications",principal.getName() + "-send" + msg);
        }
        else
        {
            simpMessagingTemplate.convertAndSendToUser("wyf","/queue/notifications",principal.getName() + "-send" + msg);
        }
    }
}
