package com.dlut.autoconfiguration;

import com.dlut.config.HelloServiceProperties;
import com.dlut.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class HelloServiceAutoConfiguration
{
    @Autowired
    private HelloServiceProperties helloServiceProperties;

    @Bean
    /**
     * 当容器中没有这个这个bean
     */
    @ConditionalOnClass(HelloService.class)
    /**
     * matchIFmissing:为true时,属性没设会让他通过
     *                为false时,属性没设不会让其通过
     * 在application.properties中   属性名称为  prefix + "." + value
     */
    @ConditionalOnProperty(prefix = "hello",value = "enabled",matchIfMissing = true)
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService()
    {
        HelloService helloService  = new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }
}
