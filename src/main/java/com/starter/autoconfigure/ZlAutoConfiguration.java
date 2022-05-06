package com.starter.autoconfigure;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author tzxx
 */
@Configuration
@EnableConfigurationProperties(ZlProperties.class)
@ConditionalOnClass({HelloHandler.class})
public class ZlAutoConfiguration{
    private final ZlProperties zlProperties;

    @Autowired
    public ZlAutoConfiguration(ZlProperties properties) {
        this.zlProperties = properties;
    }

    @Bean
    public HelloHandler helloHandler(){
        HelloHandler helloHandler = new HelloHandler();
        helloHandler.setName(zlProperties.getName());
        return helloHandler;
    }
}
