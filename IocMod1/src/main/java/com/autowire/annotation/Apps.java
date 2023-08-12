package com.autowire.annotation;

public class Apps {

	private String whatsapp;
	private double memory;
	private int cost;
	
	public Apps() {

	}

	public Apps(String whatsapp, double memory, int cost) {
		this.whatsapp = whatsapp;
		this.memory = memory;
		this.cost = cost;
		System.out.println("arg-constr Apps");
	}

	@Override
	public String toString() {
		return "Apps [whatsapp=" + whatsapp + ", memory=" + memory + ", cost=" + cost + "]";
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
		System.out.println("setters Apps whatsapp");
	}

	public double getMemory() {
		return memory;
	}

	public void setMemory(double memory) {
		this.memory = memory;
		System.out.println("setters Apps memory");
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
		System.out.println("setters Apps cost");
	}
	
}
