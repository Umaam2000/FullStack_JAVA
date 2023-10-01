package com.ust.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Jun5SecurityApplication {
	@GetMapping
	public String home() {
		return "WELCOME TO OOTY,NICE TO MEET YOU";
	}

	public static void main(String[] args) {
		SpringApplication.run(Jun5SecurityApplication.class, args);
	}

}
