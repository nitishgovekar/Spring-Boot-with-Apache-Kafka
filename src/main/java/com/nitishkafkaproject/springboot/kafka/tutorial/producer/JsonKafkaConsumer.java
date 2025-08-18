package com.nitishkafkaproject.springboot.kafka.tutorial.producer;

import com.nitishkafkaproject.springboot.kafka.tutorial.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "${spring.kafka.jsontopic.name}", groupId = "myGroup")
    public void consumer(User user){
        LOGGER.info(String.format("Json message recieved  in  JsonKafkaConsumer ==> %s",user.toString()));

    }
}
