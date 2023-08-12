package com.beanLifeCycle.SpringInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class FoodKing implements InitializingBean,DisposableBean{
	private String dish;
	private double cost;
	
	public String getDish() {
		System.out.println("getdish");
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
		System.out.println("setdish");
	}
	public double getCost() {
		System.out.println("getcost");
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
		System.out.println("setcost");
	}
	@Override
	public String toString() {
		return "FoodKing [dish=" + dish + ", cost=" + cost + "]";
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("initializing the objects using initializing bean");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroying the objects by dispensableBean");		
	}
}
