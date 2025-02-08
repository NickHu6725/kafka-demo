package com.hhz.kafka.controller;

import com.hhz.kafka.consumer.Receiver;
import com.hhz.kafka.producer.Sender;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    private Sender sender;

    @Autowired
    private Receiver receiver;

    @PostMapping("/producer")
    public void producer(@RequestBody String content, HttpServletResponse response){
        sender.send(content);
    }


    @GetMapping("/consumer")
    public void consumer(){
         receiver.getLatch();
    }
}
