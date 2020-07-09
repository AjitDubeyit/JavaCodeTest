package com.example.coadingtest.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class EmployeeConfiguration {
	
	@Bean("contractEmployee")
	public Employee getContractEmplyee() {
		return new Employee(10, "contract");
	}

	@Bean("permanentEmployee")
	public Employee getPermanentEmplyee() {
		return new Employee(11, "permanent");
	}

}
