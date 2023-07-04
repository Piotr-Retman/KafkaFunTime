package com.example.kafkafuntime.api;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class SimpleKafkaProducer {

    /**
     * An Apache Kafka® Producer is a client application that publishes (writes) events to a Kafka cluster.
     *
     * @param kafkaTemplate
     */
    public SimpleKafkaProducer(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String msg){
        CompletableFuture<SendResult<String, String>> call = kafkaTemplate.send("test", msg);
        call.whenComplete((res, ex) -> {
            if(ex != null){
                System.out.println("Error appeared:" + ex.getMessage());
            }else{
                System.out.println(res);
            }
        });
    }
}
