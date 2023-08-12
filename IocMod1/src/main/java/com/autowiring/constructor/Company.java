package com.autowiring.constructor;

public class Company {
	private int eid;
	private String ename;
	private double esal;
	
	public Company() {

		System.out.println("no arg constructor in company");
	}

	public Company(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		System.out.println("constructor argument in Company");
	}

	@Override
	public String toString() {
		return "Company [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
		System.out.println("setters of eid company");
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
		System.out.println("setters of ename company");
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
		System.out.println("setters of esal company");
	}
	
	
	
}
