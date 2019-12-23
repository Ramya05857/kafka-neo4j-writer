# Spring Boot with SpringData Neo4J
## Version used
- Spring Boot - 1.5.14.RELEASE
- Neo4J Bolt Driver - 2.1.1

## Start Zookeeper
- `bin/zookeeper-server-start.sh config/zookeeper.properties`

## Start Kafka Server
- `bin/kafka-server-start.sh config/server.properties`

## Create Kafka Topic
- `bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Example_Topic`

## Start Kafka Producer
- `bin/kafka-console-producer.sh -broker-list localhost:9092 --topic Example_Topic`

## Neo4J 
- Docker command to bring up Neo4J server
```
docker run --publish=7474:7474 --publish=7687:7687 neo4j:3.0
```
- Neo4J Browser URL
```
http://localhost:7474/browser
```
