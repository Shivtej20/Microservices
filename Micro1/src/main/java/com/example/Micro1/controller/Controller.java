package com.example.Micro1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private Environment env;
	
	@GetMapping("/1")
	public String getwelcome() {
		String port = env.getProperty("server.port");
		String msg = "Microservices 1 "+ ( port );
		return msg;
	}

}
