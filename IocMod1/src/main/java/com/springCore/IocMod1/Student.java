package com.springCore.IocMod1;

public class Student {

	private int usn;
	private String name;
	private double marks;
	
	public Student() {
		super();
		System.out.println("object created");
	}
	
	public int getUsn() {
		
		return usn;
	}
	public void setUsn(int usn) {
		System.out.println("By using setters and getters injection");
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
}
