package com.yin.mq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqApplicationTests {

    @Autowired
    private  HelloRabbitProvider helloRabbitProvider;
    @Test
    public void contextLoads() {

        helloRabbitProvider.send();

    }

    @Test
    public void consumer() {
    }
}
