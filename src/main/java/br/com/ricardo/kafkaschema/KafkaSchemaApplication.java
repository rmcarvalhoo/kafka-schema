package br.com.ricardo.kafkaschema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("br.com.ricardo.kafkaschema.properties")
public class KafkaSchemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSchemaApplication.class, args);
	}

}
