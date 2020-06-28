package com.test.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		Alien al = context.getBean(Alien.class);
		al.showMsg();
		
		//Alien al1 = context.getBean(Alien.class);
		//al1.showMsg();

		
	}

}
