package com.example.springcloudfeign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcloudfeign.client.UserClient;
import com.example.springcloudfeign.dto.UserResponse;

@RestController
public class FeignController {
	
	@Autowired
	UserClient userClient;
	
	@RequestMapping("/usersList")
	public List<UserResponse> getUsersList(){
		return userClient.getUsers();
	}
	

}
