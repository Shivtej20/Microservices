package com.example.config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
	
	@Value("${msg}")
	private String msgText;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return msgText;
	}

}
