package com.krishna.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	
	@Value("${greeting.message}")
	private String message;

	@Value("101")
	private int id;

	
	@RequestMapping("/message")
	public String handler1() {
		return message;
	}

	@RequestMapping("/id")
	public int handler2() {
		return id;
	}
	
}
