package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		String var = null;
		System.out.println(var.length());
		return "Greetings from Spring Boot!";
	}

}
