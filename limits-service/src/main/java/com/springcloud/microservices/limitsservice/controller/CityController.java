package com.springcloud.microservices.limitsservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.microservices.limitsservice.beans.City;
import com.springcloud.microservices.limitsservice.beans.CityRepository;

@RestController
public class CityController {

	@Autowired
	private CityRepository cityRepository;

	@GetMapping("/city")
	public ResponseEntity<List<City>> getAllCity() {
		List<City> city = cityRepository.findAll();
		return ResponseEntity.status(200).body(city);
	}
}
