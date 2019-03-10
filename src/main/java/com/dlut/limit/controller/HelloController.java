package com.dlut.limit.controller;

import com.dlut.limit.service.AccessLimitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Controller(value = "hello")
public class HelloController {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private AccessLimitService accessLimitService;

    @RequestMapping("/access")
    @ResponseBody
    public String access(){
        //尝试获取令牌
        if(accessLimitService.tryAcquire()){
            //模拟业务执行500毫秒
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            log.info("request success:[" + sdf.format(new Date()) + "]");
            return "aceess success [" + sdf.format(new Date()) + "]";
        }else{
            log.info("request limit:[" + sdf.format(new Date()) + "]");
            return "aceess limit [" + sdf.format(new Date()) + "]";
        }
    }
}
