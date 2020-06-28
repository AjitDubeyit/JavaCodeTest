package com.springboot.SpringBootDemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.springboot.SpringBootDemo.Interceptor.RequestHeaderInterceptior;

@Configuration
public class StudentConfig implements WebMvcConfigurer {
	
	@Autowired
	RequestHeaderInterceptior requestHeaderInterceptior;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestHeaderInterceptior);
	}
}
