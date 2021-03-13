package com.springcloud.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.microservices.limitsservice.beans.Limits;
import com.springcloud.microservices.limitsservice.configuration.LimitsConfiguration;

@RestController
public class LimitsController {

	@Autowired
	private LimitsConfiguration configuration;

	@GetMapping("/limits")
	public Limits retrieveLimits() {

		return new Limits(configuration.getMinimum(), configuration.getMaximum());
	}
}
