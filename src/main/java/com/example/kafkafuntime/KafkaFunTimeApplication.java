package com.example.kafkafuntime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaFunTimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaFunTimeApplication.class, args);
    }

}
