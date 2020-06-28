package com.springboot.SpringBootDemo.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpringBootDemo.exception.InvalidFieldException;
import com.springboot.SpringBootDemo.model.Student;

@RestController
@RequestMapping("/student")
public class StudentController {

	@PostMapping
	public String saveStudentInformation(@RequestHeader("student-auth-key") String authorization,
			@RequestBody Student student) {
		
		if(StringUtils.isEmpty(student.getLastName())) {
			throw new InvalidFieldException("Last name is required field");
		}
		return String.format("Authorization %s is valid, and data is saved", authorization);
	}
}
