package com.dlut.controller;

import com.dlut.utils.Emailutils;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zh
 * @ClassName cn.aduu.web.EmailController
 * @Description
 */
@RestController
public class EmailController {

    private static final Logger logger = LoggerFactory.getLogger(EmailController.class);

    @RequestMapping("sendEmail")
    public String sendEmail() throws JsonProcessingException {
        boolean isSend = Emailutils.sendEmail("这是一封测试邮件", new String[]{"1063878320@qq.com"}, null, "Hello,fys!欢迎来到我的世界!!", null);
        return "发送邮件:" + isSend;
    }


}