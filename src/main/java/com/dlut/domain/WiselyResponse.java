package com.dlut.domain;

/**
 * 服务器向浏览器发送此类的消息
 */
public class WiselyResponse
{
    private String responseMsg;

    public WiselyResponse(String responseMsg)
    {
        this.responseMsg = responseMsg;
    }

    public String getResponseMsg()
    {
        return responseMsg;
    }
}
