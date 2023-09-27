package com.user.service.controller;

//import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/public")
public class HomeController {
	
	
	
//	public String topic="NewTopic";
//	
//	KafkaTemplate<String,String> kafkaTemplate;

	@GetMapping("/home/message")
	public String home(@PathVariable String message) {
		
		///kafkaTemplate.send(topic, message);
		return "this is a home page";
	}
}
