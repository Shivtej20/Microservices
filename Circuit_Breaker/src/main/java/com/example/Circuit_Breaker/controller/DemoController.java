package com.example.Circuit_Breaker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class DemoController {
	
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataFromDB", name = "CB")
	public String getDataFromRedis() {
		System.out.println("Redis() method Executed");
		int a = 10/0;
		return "Data fetched from redis";
	}
	
	public String getDataFromDB(Throwable throwable) {
		System.out.println("DB() method Executed");
		return "Data fetched from DB";
	}

}
