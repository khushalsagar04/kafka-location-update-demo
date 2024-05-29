package com.khushal.end_user.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
//    6

    @KafkaListener(topics = "location-update", groupId = "group-1")
    public void updatedLocation(String value){
        System.out.println(value);
    }
}
