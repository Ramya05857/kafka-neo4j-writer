package com.lowes.kafkaneo4jwriter.listener;

import com.lowes.kafkaneo4jwriter.service.Neo4jWriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaEventListener {

    @Autowired
    private Neo4jWriterService neo4jWriterService;

    @KafkaListener(topics = "Example_Topic", group = "group_id")
    public void consume(String message) { neo4jWriterService.saveKafkaEvent(message);}
}
