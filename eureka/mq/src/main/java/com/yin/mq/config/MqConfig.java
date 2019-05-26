package com.yin.mq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * User: Administrator
 * Date:2019/5/22
 * Time: 22:33
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class MqConfig {
    @Bean
    public Queue queue() {
        return new Queue("helloRabbit1");
    }

//    @Bean
//    public DirectExchange directExchange(){
//        return  new DirectExchange("DirectExchange");
//    }
//
//    @Bean
//    public TopicExchange topicExchange(){
//        return  new TopicExchange("TopicExchange");
//    }
    @Bean
    public MessageConverter messageConverter(){
        return new  Jackson2JsonMessageConverter();
    }
}
