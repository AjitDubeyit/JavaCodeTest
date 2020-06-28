package com.example.springbootsecurity;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SpringBootSecurityApplicationTests extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource dataSource;
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception{

		auth.jdbcAuthentication().dataSource(dataSource);
		
		
		/*auth.inMemoryAuthentication().withUser("ajit").password("ajit").roles("user")
		.and().withUser("jyoti").password("jyoti").roles("admin");*/
	}
	
	
	@Override
	public void configure(HttpSecurity http) throws Exception
	{
		http.authorizeRequests()
		.antMatchers("/user").hasAnyRole("user","admin")
		.antMatchers("/admin").hasRole("admin")
		.antMatchers("/").permitAll()
		.and().formLogin();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
}
