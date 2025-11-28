package com.demo.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyApiController {
	
	@GetMapping("/status")
	public String getStatus()
	{
		return "Application is up and running";
	}

}
