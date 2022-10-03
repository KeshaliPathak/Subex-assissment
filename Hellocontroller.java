package com.api.rest.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hellocontroller {
	@GetMapping("/hello")
	public String helloMethod() {
		return "HELLO WORLD";
	}

}
