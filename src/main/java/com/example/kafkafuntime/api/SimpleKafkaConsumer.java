package com.example.kafkafuntime.api;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class SimpleKafkaConsumer {

    /**
     * An Apache Kafka® Consumer is a client application that subscribes to (reads and processes) events.
     *
     * @param message
     */
    @KafkaListener(topics = "test", groupId = "foo")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
