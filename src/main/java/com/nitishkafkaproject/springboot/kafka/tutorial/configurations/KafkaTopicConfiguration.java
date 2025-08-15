package com.nitishkafkaproject.springboot.kafka.tutorial.configurations;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic firstTopic(){
        // There should not be any space between the Topic name otherwise we get compilation error
        return TopicBuilder.name("FirstTopic").build();
    }

}

