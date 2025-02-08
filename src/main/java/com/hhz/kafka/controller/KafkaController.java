package com.hhz.kafka.controller;

import com.hhz.kafka.producer.Sender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @PostMapping("/producer")
    public void producer(@RequestBody String str){
        new Sender().send(str);
    }
}
