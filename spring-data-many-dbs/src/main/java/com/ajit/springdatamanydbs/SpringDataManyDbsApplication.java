package com.ajit.springdatamanydbs;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ajit.springdatamanydbs.entity.product.Product;
import com.ajit.springdatamanydbs.entity.user.User1;
import com.ajit.springdatamanydbs.repository.ProductRepository;
import com.ajit.springdatamanydbs.repository.UserRepository;

@SpringBootApplication
public class SpringDataManyDbsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataManyDbsApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@PostConstruct
	void init() {
		User1 ajitDubey = new User1("Ajit", "Dubey");
		userRepository.save(ajitDubey);
		
		Product product = new Product("Mobile",19);
		productRepository.save(product);
	}
	

}
