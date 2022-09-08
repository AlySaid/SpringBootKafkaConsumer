package com.consumer;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.producer.entity.KafkaLogger;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringbootKafkaConsumerApplication {
	Logger log = (Logger) LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaConsumerApplication.class, args);
	}
	
    @KafkaListener(topics = "t1", groupId = "group_id")
    public void listen(KafkaLogger logger) {
    	log.info("Received information : " + logger);
    	
    }
}
