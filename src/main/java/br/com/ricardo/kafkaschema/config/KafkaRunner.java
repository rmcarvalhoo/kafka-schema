package br.com.ricardo.kafkaschema.config;

import br.com.ricardo.kafkaschema.avro.model.TransactionEvent;
import br.com.ricardo.kafkaschema.avro.model.TransactionEventBody;
import br.com.ricardo.kafkaschema.avro.model.TransactionEventHeader;
import br.com.ricardo.kafkaschema.avro.model.TransactionType;
import br.com.ricardo.kafkaschema.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import static java.time.ZoneOffset.UTC;
import static java.time.ZonedDateTime.now;
import static java.util.UUID.randomUUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaRunner implements CommandLineRunner {

    private final KafkaProducer kafkaProducer;

    @Override
    public void run(String... args) {
        log.info("Sending transactionEvent kafka message...");
        kafkaProducer.sendMessage(mockTransactionEvent());
    }

    private TransactionEvent mockTransactionEvent() {
        return TransactionEvent.newBuilder()
                .setHeader(TransactionEventHeader.newBuilder()
                        .setId(randomUUID().toString())
                        .setSourceSystem("kafka-schema-app")
                        .setCreatedAt(now(UTC).toEpochSecond())
                        .build()
                )
                .setBody(TransactionEventBody.newBuilder()
                        .setTransactionId(randomUUID().toString())
                        .setUserId(randomUUID().toString())
                        .setTransactionType(TransactionType.INSTANT_PAYMENT)
                        .setDate(now(UTC).toEpochSecond())
                        .setAmount(1500)
                        .setCurrency("EUR")
                        .setDescription("Birthday gift for Jose")
                        .build())
                .build();
    }
}
