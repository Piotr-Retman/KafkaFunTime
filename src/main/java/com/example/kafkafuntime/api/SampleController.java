package com.example.kafkafuntime.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class SampleController {

    public SampleController(SimpleKafkaProducer kafkaTemplateTest){
        this.simpleKafkaProducer = kafkaTemplateTest;
    }

    private final SimpleKafkaProducer simpleKafkaProducer;

    @RequestMapping(method = RequestMethod.GET, path = "/simple")
    public String simpleApi(){
        simpleKafkaProducer.sendMessage("Hello mtrfkr");
        return "ok";
    }
}
