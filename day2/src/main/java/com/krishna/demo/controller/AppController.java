package com.krishna.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.demo.service.AppService;

@RestController
public class AppController {

	@Autowired
	AppService service;

	@RequestMapping("/message")
	public String message() {
		return service.getMessage();
	}

}
