package com.autowiring.constructor;

public class Employee {
	private Company comp;

	public Employee() {
		System.out.println("no-arg constructor of employee");
	}

	public Employee(Company comp) {
		super();
		this.comp = comp;
		System.out.println("arg-constructor of Employee");
	}

	@Override
	public String toString() {
		return "Employee [comp=" + comp + "]";
	}

	public Company getComp() {
		return comp;
	}

	public void setComp(Company comp) {
		this.comp = comp;
		System.out.println("setters of Employee");
	}
	
}
