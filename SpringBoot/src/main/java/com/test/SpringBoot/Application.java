package com.test.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner{
	//@Value("${myapp.language}")
	//String lang;
	
	@Autowired
	MyProperties myProps;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		//Alien al = context.getBean(Alien.class);
		//al.showMsg();
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("lang is: "+myProps.getMyapp().getLanguage() + 
				" name: " + myProps.getName()+
				" version: " + myProps.getVersion()+
				" zip: " + myProps.getZip()[0]+
				" messaging used: " + myProps.getMessagingused());
	}
	
	

}
