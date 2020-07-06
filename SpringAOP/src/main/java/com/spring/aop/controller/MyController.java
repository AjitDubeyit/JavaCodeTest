package com.spring.aop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/")
	public String helloDemo() {
		//int i = 8/0;
		return "hello";
	}
}
