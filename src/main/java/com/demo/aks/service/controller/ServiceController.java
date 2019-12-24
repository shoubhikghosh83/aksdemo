package com.demo.aks.service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

	@RequestMapping(value = "/healthCheck")
	public ResponseEntity<String> healthCheck()
	{
		return ResponseEntity.ok("UP");
	}
	
}
