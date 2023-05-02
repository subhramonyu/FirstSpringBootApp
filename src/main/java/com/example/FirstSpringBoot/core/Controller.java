package com.example.FirstSpringBoot.core;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/welcome")
	public static String Welcome() {
		return "Welcome to Spring boot App";
	}

}
