package com.lowes.kafkaneo4jwriter.service;

import com.lowes.kafkaneo4jwriter.repository.KafkaEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Neo4jWriterService {

    @Autowired
    private KafkaEventRepository kafkaEventRepository;

    public void saveKafkaEvent(String message) {kafkaEventRepository.saveKafkaEvent(message); }
}