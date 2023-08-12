package com.autowiring;

public class Certificate {
	private Student stud;

	
	public Certificate() {
		
	}
	
	public Certificate(Student stud) {
		this.stud = stud;
		System.out.println("constructor certificate");
	}

	public Student getStud() {
		return stud;
	}

	public void setStud(Student stud) {
		this.stud = stud;
		System.out.println("setter and getters in certificate class");
	}

	@Override
	public String toString() {
		return "Certificate [stud=" + stud + "]";
	}
	
	
	
	

	
	
	

}
