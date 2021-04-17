package com.creator.cloud.stream.api;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SpringCloudStreamKafkaConsumerApplication {

	private Logger logger=LoggerFactory.getLogger(SpringCloudStreamKafkaConsumerApplication.class);
	
	@StreamListener("input")
	public void consumeMessage(com.creator.cloud.stream.api.model.Book book) {
		logger.info("Consumed message : "+book);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamKafkaConsumerApplication.class, args);
	}

}
