package com.example.coadingtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@Autowired
	@Qualifier("contractEmployee")
	Employee emp;

	@Autowired
	ServiceClass serviceClass;
	
	
	@PostMapping("/test")
	public String callTest() {
		System.out.println(emp.getName());
		return emp.getName();
	}


}
