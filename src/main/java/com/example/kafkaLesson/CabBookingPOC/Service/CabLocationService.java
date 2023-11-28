package com.example.kafkaLesson.CabBookingPOC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CabLocationService {
    //to publish the messages , we need KafkaTemplate.
    @Autowired
    private KafkaTemplate<String , Object> kafkaTemplate; //key is string , value is boolean.

    public boolean updateLocation(String location)
    {
        kafkaTemplate.send("cab-location",location); //(topicName , data) //topicName came from what is set in config folder.
        return true;
    }

}

