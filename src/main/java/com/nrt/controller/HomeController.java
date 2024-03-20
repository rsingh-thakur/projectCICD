package com.nrt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/test")
	public String testMethod() {
		return "Response Message from service";
	}
}
