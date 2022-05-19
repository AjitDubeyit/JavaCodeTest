package com.example.springcloudfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableFeignClients
//@EnableHystrix
public class SpringCloudFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFeignApplication.class, args);
	}
}
