package com.nitishkafkaproject.springboot.kafka.tutorial.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void  sendMessage(String message){
        // Here the topic name should be same as the one we provide in the Kafka Topic Configuration
        LOGGER.info(String.format("Message Sent %s", message));
        kafkaTemplate.send("a",message);
    }
}
