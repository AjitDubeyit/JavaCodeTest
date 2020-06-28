package com.springboot.SpringBootDemo.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.springboot.SpringBootDemo.exception.InvalidHeaderFieldException;

@Component
public class RequestHeaderInterceptior extends HandlerInterceptorAdapter{
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if(StringUtils.isEmpty(request.getHeader("student-auth-key"))) {
			throw new InvalidHeaderFieldException("Invalid request!");
		}
		return super.preHandle(request, response, handler);
	}
	

}
