package com.nitishkafkaproject.springboot.kafka.tutorial.controller;

import com.nitishkafkaproject.springboot.kafka.tutorial.model.User;
import com.nitishkafkaproject.springboot.kafka.tutorial.producer.JsonKafkaProdcuer;
import com.nitishkafkaproject.springboot.kafka.tutorial.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @Autowired
    private JsonKafkaProdcuer jsonKafkaProdcuer;

    //http:localhost:8080/api/v1/kafka/publish?message=hello world
    @GetMapping("/publish")
    public ResponseEntity<String> publish (@RequestParam("message") String message){
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to Kafka Topic");
    }
    //http://localhost:8080/api/v1/kafka/publish
    @PostMapping("/publish")
    public ResponseEntity<String> publish (@RequestBody User user){
        jsonKafkaProdcuer.sendMessage(user);
        return ResponseEntity.ok("JSON Message Sent to the Kafka Producer");
    }



}
