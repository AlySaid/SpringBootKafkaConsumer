package com.producer.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KafkaLogger{


//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String request;
	private String response;
	private Date currentDateTime;
	@Override
	public String toString() {
		return "KafkaLogger [id=" + id + ", request=" + request + ", response=" + response + ", currentDateTime="
				+ currentDateTime + "]";
	}
	
	
}
