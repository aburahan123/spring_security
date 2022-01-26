package com.altimetrik.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyBalanceController {

	@GetMapping("/balance")
	public String balance()
	{
		return "balance";
	}
}
