package com.bankingApplication.bankExpert;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main_controller {
	
	
	@GetMapping("/test")
	public String successmassage() {
		return "Application run sussfully";
	}


	
	
	
	
}
