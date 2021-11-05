package com.example.kafkaavro.config;

import java.util.HashMap;
import java.util.Map;


import avro.com.example.kafkaavro.dto.person;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import io.confluent.kafka.serializers.KafkaAvroSerializerConfig;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;


@Configuration

public class KafkaProducerConfig {


    /*@Value("${spring.kafka.bootstrap-servers}" )
    private String bootstrapServers;*/

    /*@Value("${schema.registry.url}")
    private String schemaRegistryUrl;*/

    @Bean
    public ProducerFactory<String,person> producerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);

        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
        props.put(KafkaAvroSerializerConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");
        return new DefaultKafkaProducerFactory<>(props);
    }

   /* @Bean
    public ProducerFactory<String, person> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
   }*/
//
   @Bean
    public KafkaTemplate<String, person> kafkaTemplate() {
        return new KafkaTemplate<>(producerConfigs());
    }

}