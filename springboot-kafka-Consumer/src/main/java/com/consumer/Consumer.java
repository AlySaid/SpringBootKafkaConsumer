//package com.consumer;
//
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//import com.consumer.entity.KafkaLogger;
//
//@Service
//public class Consumer {
//	
//	@KafkaListener(topics = "t1", groupId = "group_id")
//	public void kafkaConsumer(KafkaLogger logger) {
//		System.out.println("******************"+logger);
//	}
//}
