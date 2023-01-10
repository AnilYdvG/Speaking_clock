package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ClockService;

@RestController
@RequestMapping("/time")
public class ClockController {
	@Autowired
	private ClockService clockService;

	@GetMapping
	@RequestMapping("/get")
	public ResponseEntity<String> putTime() {
		String time = clockService.getTime();
		return ResponseEntity.status(200).body(time);

	}

}
