package com.altimetrik.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyLoanController {

	@GetMapping("/loan")
	public String loan()
	{
		return "loan";
	}
}
