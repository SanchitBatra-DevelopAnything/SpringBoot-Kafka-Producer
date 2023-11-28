package com.example.kafkaLesson.CabBookingPOC.Controller;

import com.example.kafkaLesson.CabBookingPOC.Service.CabLocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class CabLocationController {

    @Autowired
    private CabLocationService cabLocationService;

    @PutMapping
    public ResponseEntity<Object> updateLocation() throws InterruptedException {
        int range = 100;
        while(range > 0)
        {
            cabLocationService.updateLocation(Math.random()+","+Math.random()); //consider it to be lat long data.
            Thread.sleep(1000); //wait for 1 second and then send another location...
            range--;
        }
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("message" , "location updated successfully!"));
    }

}
