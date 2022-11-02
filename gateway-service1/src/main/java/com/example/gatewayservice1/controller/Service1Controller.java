package com.example.gatewayservice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {
	
	@Autowired
	private Environment envt;

	@GetMapping("/get")
	public String getSomething() {
		
		String port = envt.getProperty("local.server.port");
		return "Service running from port : " + port;
	}
}
