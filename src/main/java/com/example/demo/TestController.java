package com.example.demo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("hi")
@PreAuthorize("hasRole('USER')")	
	public String hi() {
		return "Hi helo viewers";
		
	}

	@GetMapping("/api/data")
	public String withoutdata() {
		return "withoutData";
	}
}
