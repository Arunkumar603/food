package com.krishna.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	@RequestMapping("/")
	public String handlerMethod() {
		return "Welcome to Springboot!!";
	}

	@RequestMapping("/message")
	public String getMessage() {
		return "Good morning";
	}

}
