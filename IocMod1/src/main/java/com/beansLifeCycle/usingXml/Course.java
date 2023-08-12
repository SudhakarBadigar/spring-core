package com.beansLifeCycle.usingXml;

public class Course {
	private String subjectName;
	private int subjectDuration;
	
	//we can chane the init name but not the signature of that method
	public void init() {
		System.out.println("init method called exam started");
	}
	public void destroy() {
		System.out.println("destroy method called exam ended");
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getSubjectDuration() {
		return subjectDuration;
	}
	public void setSubjectDuration(int subjectDuration) {
		this.subjectDuration = subjectDuration;
	}
	@Override
	public String toString() {
		return "Course [subjectName=" + subjectName + ", subjectDuration=" + subjectDuration + "]";
	}
	
}
