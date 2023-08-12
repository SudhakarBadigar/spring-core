package com.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Mobile {

	
	@Autowired
	@Qualifier("app1")
	private Apps app;

	public Mobile() {
		System.out.println("no-arg constructor of Mobile");
	}

	public Mobile(Apps app) {
		this.app = app;
		System.out.println("injecting property through constructor arg-cons of Mobile");
	}

	@Override
	public String toString() {
		return "Mobile [app=" + app + "]";
	}

	public Apps getApp() {
		return app;
	}

	public void setApp(Apps app) {
		this.app = app;
		System.out.println("setting the property using setters of Mobile");
	}
	
	
	
	
	
}
