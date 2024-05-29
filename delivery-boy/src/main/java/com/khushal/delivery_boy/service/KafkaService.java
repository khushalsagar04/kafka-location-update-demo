package com.khushal.delivery_boy.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

//    2
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private org.slf4j.Logger logger = LoggerFactory.getLogger(KafkaService.class);
    public boolean updateLocation(String location){
        kafkaTemplate.send("location-update", location);
        return true;
    }
}
