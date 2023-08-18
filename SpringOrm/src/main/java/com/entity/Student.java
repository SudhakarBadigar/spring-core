package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int studentUsn;
	private String studentName;
	private String StudentCity;
	
	public Student() {
		super();
	}

	public Student(int studentUsn, String studentName, String studentCity) {
		super();
		this.studentUsn = studentUsn;
		this.studentName = studentName;
		this.StudentCity = studentCity;
	}

	@Override
	public String toString() {
		return "Student [studentUsn=" + studentUsn + ", studentName=" + studentName + ", StudentCity=" + StudentCity
				+ "]";
	}

	public int getStudentUsn() {
		return studentUsn;
	}

	public void setStudentUsn(int studentUsn) {
		this.studentUsn = studentUsn;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return StudentCity;
	}

	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	
}
