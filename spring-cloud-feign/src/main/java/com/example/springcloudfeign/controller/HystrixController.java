//package com.example.springcloudfeign.controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.springcloudfeign.dto.LimitConfiguration;
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//
//@RestController
//public class HystrixController {
//	
//	@GetMapping("/fault-tolerance-example")  
//	//configuring a fallback method  
//	@HystrixCommand(fallbackMethod="fallbackRetrieveConfigurations")  
//	public LimitConfiguration retrieveConfigurations()  
//	{  
//	throw new RuntimeException("Not Available");   
//	}  
//	//defining the fallback method 
////	@GetMapping("/abc")  
//	public LimitConfiguration fallbackRetrieveConfigurations()  
//	{  
//	//returning the default configuration     
//		return new LimitConfiguration(999, 9);   
//	}  
//
//}
