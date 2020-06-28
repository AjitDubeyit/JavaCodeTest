package com.springboot.SpringBootDemo.handler;

import org.apache.tomcat.util.http.fileupload.InvalidFileNameException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.springboot.SpringBootDemo.exception.InvalidHeaderFieldException;

@RestControllerAdvice
public class StudentExceptionHandler {
	
	@ExceptionHandler
	public String handleInvalidFieldException(InvalidFileNameException exception) {
		return exception.getMessage();
	}
	
	@ExceptionHandler
	public ResponseEntity<String> handleInvalidHandlerFieldException(InvalidHeaderFieldException exception){
		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.PRECONDITION_FAILED);
	}

}
