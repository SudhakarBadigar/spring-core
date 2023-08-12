package com.InjectObjectIntoOther;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Pizzaconf {
	
	@Bean
	public Pepsi getPepsi(){
		Pepsi p = new Pepsi();
		return p;
	}

	@Bean(name= {"a"})
	public Pizza getPizza(){
		Pizza pi = new Pizza(getPepsi());
		return pi;
	}
}
