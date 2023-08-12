package com.beanAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConf {

	@Bean(name = {"a","b","c"})
	public Pizza getPizza() {
		Pizza p = new Pizza();
		return p;
	}
}
