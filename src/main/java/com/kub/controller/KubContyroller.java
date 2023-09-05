package com.kub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KubContyroller {
	
	@GetMapping("/details")
	public String getDetails() {
		return "Doc-Kub-Jenkins-CICD-Learning,build-1";
	}
	
	@GetMapping
	public String getMessage() {
		
		return "Testing";
	}

}
