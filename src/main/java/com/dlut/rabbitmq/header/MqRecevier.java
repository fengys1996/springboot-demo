package com.dlut.rabbitmq.header;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service(value = "headerMqRecevier")
@Slf4j
public class MqRecevier
{
    //@RabbitListener(queues = MqConfig.HEADR_QUEUE)
    public void rece(byte[] msgBytes)
    {
        String msg = new String(msgBytes);
        log.info("rece message:" + msg);
    }
}
