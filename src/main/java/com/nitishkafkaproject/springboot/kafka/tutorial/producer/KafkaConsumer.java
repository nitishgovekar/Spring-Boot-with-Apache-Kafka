package com.nitishkafkaproject.springboot.kafka.tutorial.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);
    // Here we provide the topic name and groupId from the application properties file
    // to listen from the Kafka Producer
    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "myGroup")
    public void consume(String message){
        LOGGER.info(String.format("Message Received %s", message));

    }
}
