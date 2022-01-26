package com.altimetrik.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCardController {

	@GetMapping("/card")
	public String card()
	{
		return "card";
	}
}
