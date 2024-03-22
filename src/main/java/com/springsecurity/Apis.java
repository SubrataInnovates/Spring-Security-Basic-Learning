package com.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apis 
{
	@GetMapping("/hiAll")
	public String hello()
	{
		return "Welcome";
	}
}
