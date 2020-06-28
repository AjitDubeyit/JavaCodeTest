package com.example.springbootsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String home() {
		return "Welcome";
	}

	@GetMapping("/user")
	public String user()
	{
		return "welcom user";
	}
	@GetMapping("/admin")
	public String admin()
	{
		return "welcom admin";
	}
}
