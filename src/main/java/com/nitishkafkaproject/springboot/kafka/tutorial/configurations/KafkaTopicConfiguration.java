package com.nitishkafkaproject.springboot.kafka.tutorial.configurations;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {
    @Value("${spring.kafka.topic.name}")
    private String topicName;

    @Bean
    public NewTopic firstTopic(){
        // There should not be any space between the Topic name otherwise we get compilation error
        return TopicBuilder.name(topicName).build();
    }


    @Bean
    public NewTopic jsonTopic(){
        // There should not be any space between the Topic name otherwise we get compilation error
        return TopicBuilder.name("jsonTopic").build();
    }

}

