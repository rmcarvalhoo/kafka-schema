# kafka-schema
POC - Springboot, Java, Schema Registry, Apache Avro e Apache Kafka.
The purpose of the **kafka-schema** is to configure a basic Kafka producer and consumer that will produce and consume messages from the same topic, using a pre defined avro schema for the message sent

## Theoretical foundations

> Springboot: Spring Boot is a Spring project that came to facilitate the process of configuring and publishing our applications. The intention is to have your project running as quickly as possible and without complications.

> Apache Kafka: Apache Kafka is an open-source stream processing platform developed by the Apache Software Foundation, written in Scala and Java. The project aims to provide a unified, high-capacity, low-latency platform for real-time data processing.

> Schema Registry: The Schema Registry validates whether the message being sent by an application is compatible. We can use various file formats to create our schemas such as XML, CSV, JSON but here we will use Apache Avro which is a format developed for creating typed schemas.

> Apache avro: Avro is a thread-oriented remote call and procedure serialization framework developed in Apache's Hadoop project. It uses JSON to define data types and protocols and serializes data into a binary format.

> Java: Java is an object-oriented programming language developed in the 90s by a team of programmers led by James Gosling, at the company Sun Microsystems. In 2008 Java was acquired by the company Oracle Corporation.

## Technologies
- Java 21
- Spring Boot 3.2.3
    - spring-boot-starter-web
    - spring-kafka
- Apache Avro
- Lombok
- Tomcat (Embedded no Spring Boot)
- Git

## Executing

Applications are executed using a Maven command that invokes Spring Boot initialization.

- Scripts
  ### Execute docker-compose
    - ```docker compose up --build```
