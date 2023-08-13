package edu.lingnan.eattingwhat.common.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @JmsListener(destination = "UnitTest")
    public void receiveMessage(String message) {
        System.out.println("消息消费：：："+message);
    }
}