package com.beanLifeCycle.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dominos {
 
	private String pizza;
	private double cost;
	
	public String getPizza() {
		return pizza;
	}
	public void setPizza(String pizza) {
		System.out.println("setpizza");
		this.pizza = pizza;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Dominos [pizza=" + pizza + ", cost=" + cost + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("post construct");
	}
	@PreDestroy
	public void stop() {
		System.out.println("pre Destroy");
	}
	
    
	
	
	
}
