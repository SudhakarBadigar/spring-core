package com.autowiring;

public class Student {
	private String courseName;
	private double courseDuration;

	public Student() {
	
	}
	
	public Student(String courseName, double courseDuration) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		System.out.println("constructor Student");
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
		System.out.println("setters in student course name");
	}

	public double getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(double courseDuration) {
		this.courseDuration = courseDuration;
		System.out.println("setters in student course duration");
	}

	@Override
	public String toString() {
		return "Student [courseName=" + courseName + ", courseDuration=" + courseDuration + "]";
	}
	
}
