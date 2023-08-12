package com.constructorInjection;

public class ConstructorEmployee {
	private int eid;
	private String ename;
	private double esal;
	
	public ConstructorEmployee(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "ConstructorEmployee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
	
	

}
