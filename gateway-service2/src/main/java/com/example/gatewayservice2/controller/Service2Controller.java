package com.example.gatewayservice2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services/two")
public class Service2Controller {

	@GetMapping("/get")
	public String getSomething() {
		return "Service 2 running from port 8002";
	}
}
