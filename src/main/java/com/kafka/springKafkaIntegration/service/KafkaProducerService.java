package com.kafka.springKafkaIntegration.service;

import com.kafka.springKafkaIntegration.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private static final String TOPIC_NAME ="ProductEvent";

    private final KafkaTemplate<String, Product> kafkaTemplate;

    @Autowired
    public KafkaProducerService(KafkaTemplate<String, Product> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(Product productSendEvent){
        kafkaTemplate.send(TOPIC_NAME,productSendEvent);
    }
}
