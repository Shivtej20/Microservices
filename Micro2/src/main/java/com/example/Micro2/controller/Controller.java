package com.example.Micro2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Micro2.fiegnClient.micro1ApiFeignClient;

@RestController
public class Controller {
	@Autowired
	private Environment env;
	@Autowired
	private micro1ApiFeignClient feignClient;
	@GetMapping("/2")
	public String getwelcome() {
		
		String micro1 = feignClient.invokeMicro1();
		
		String port = env.getProperty("server.port");
		String msg = "Microservice 2 "+ ( port );
		return msg +(" ")+ micro1;
	}

}
