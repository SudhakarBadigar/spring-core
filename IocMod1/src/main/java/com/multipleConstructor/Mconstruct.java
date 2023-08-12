package com.multipleConstructor;

public class Mconstruct {

	private int x;
	private int y;
	
	public Mconstruct(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("integer constructor");
	}

	public Mconstruct(double x, double y) {
		
		this.x=(int)x;
		this.y=(int)y;
		System.out.println("double constructor");
	}
	
	public Mconstruct(String x, String y) {
		this.x=Integer.parseInt(x);
		this.y=Integer.parseInt(y);
		System.out.println("string constructor");
		
	}
	
	
	public void add() {
		System.out.println("value of x is :" +this.x);
		System.out.println("value of y is :" +this.y);
		System.out.println("Result is --> " + (this.x + this.y));

	}

	@Override
	public String toString() {
		return "Mconstruct [x=" + x + ", y=" + y + "]";
	}
	
	
}

