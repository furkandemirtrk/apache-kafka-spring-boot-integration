package com.kafka.springKafkaIntegration.service;

import com.kafka.springKafkaIntegration.model.Product;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "ProductEvent",containerFactory = "kafkaListenerContainerFactory")
    public void consume(Product product){
        System.out.println(product.toString());
    }
}
