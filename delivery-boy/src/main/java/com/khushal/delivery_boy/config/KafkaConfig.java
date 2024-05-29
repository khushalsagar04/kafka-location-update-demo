package com.khushal.delivery_boy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig{
//     1
    @Bean
    public NewTopic newTopic(){
        return TopicBuilder.name("location-update")
//                .partitions()  we can add partitions and replicas as well but here we aren't doing that
//                .replicas()
                .build();
    }
}
