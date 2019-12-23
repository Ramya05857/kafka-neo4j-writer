package com.lowes.kafkaneo4jwriter.repository;

import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
public class KafkaEventRepository {

    @Autowired
    private Session session;

    public void saveKafkaEvent(String message) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("message", message);
        String query = "CREATE (a:KafkaEvent) SET a.message = $message";
        session.query(query, parameters);
    }
}
