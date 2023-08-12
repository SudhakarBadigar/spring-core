package com.spring.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sp")
public class SpELExpression {
	
	@Value("#{5+6}")
	private int x;
	
	@Value("#{99<88 ? 5:10}")
	private double y;
   
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double squareroot;
	
	@Value("#{new java.lang.String('RAMA')}")
	private String name;
	
	
	public double getSquareroot() {
		return squareroot;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSquareroot(double squareroot) {
		this.squareroot = squareroot;
	}

	public SpELExpression() {
		super();
	}

	public SpELExpression(int x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "SpELExpression [x=" + x + ", y=" + y + ", squareroot=" + squareroot + ", name=" + name + "]";
	}
	
}
