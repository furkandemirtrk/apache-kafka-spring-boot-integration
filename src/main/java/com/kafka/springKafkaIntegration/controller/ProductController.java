package com.kafka.springKafkaIntegration.controller;

import com.kafka.springKafkaIntegration.model.Product;
import com.kafka.springKafkaIntegration.service.KafkaProducerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@AllArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class ProductController {

    private final KafkaProducerService kafkaProducerService;

    @PostMapping
    public void sendProductToKafkaTopic(@RequestBody Product product){
        this.kafkaProducerService.send(product);
    }

}
