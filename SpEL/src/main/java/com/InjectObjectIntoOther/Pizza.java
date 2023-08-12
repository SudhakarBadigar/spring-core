package com.InjectObjectIntoOther;

public class Pizza {

	private Pepsi pepsi;
	
	void Delivery() {
		pepsi.drink();
		System.out.println("Deliver the pizza");
	}

	public Pizza(Pepsi pepsi) {
		super();
		this.pepsi = pepsi;
	}

	public Pizza() {
		super();
	}

	public Pepsi getPepsi() {
		return pepsi;
	}

	public void setPepsi(Pepsi pepsi) {
		this.pepsi = pepsi;
	}

	@Override
	public String toString() {
		return "Pizza [pepsi=" + pepsi + "]";
	}
	
}
