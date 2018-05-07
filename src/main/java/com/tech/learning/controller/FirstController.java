package com.tech.learning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {

	@RequestMapping(value="/firstendpoint", method=RequestMethod.GET)
	public String firstEndPoint() {
		
		return "Welcome to spring with gradle";
	} 
}
