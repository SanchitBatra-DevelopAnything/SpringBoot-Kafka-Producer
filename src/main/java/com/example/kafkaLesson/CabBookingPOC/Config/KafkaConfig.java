package com.example.kafkaLesson.CabBookingPOC.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic topic()
    {
        //spring boot will create topic if its not available.
        return TopicBuilder.name("cab-location").build(); //saara kuch jo b per topic replicas and all counts and all sab yahan configure hojaayenge.
    }
}
