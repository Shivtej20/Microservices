package com.example.Micro2.fiegnClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "MICRO1")
public interface micro1ApiFeignClient {
	
	@GetMapping("/1")
	public String invokeMicro1();

}
