package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
	
	//@Pointcut("execution(* helloDemo(..))")
	@Pointcut("execution(public String com.spring.aop.controller.MyController.helloDemo())")
	public void controller() {
		System.out.println("controller pointcut");
	}
	
	@Before("controller()")
	public void beforeController(JoinPoint joinPoint) {
		System.out.println("before controller");
	}
	
	
	@Before("execution(public String com.spring.aop.controller.MyController.helloDemo())")
	public void beforeLog() {
		logger.info("beforeLog method called!");
	}

	@After("execution(public String com.spring.aop.controller.MyController.helloDemo())")
	public void afterLog() {
		logger.info("afterLog method called!");
	}
	
	@AfterReturning("execution(public * com.spring.aop.controller.MyController.helloDemo())")
	public void afterReturningLog() {
		logger.info("afterReturningLog method called!");
	}
	
	@AfterThrowing("execution(public * com.spring.aop.controller.MyController.helloDemo())")
	public void exception() {
		logger.info("exception method called!");
	}
}
