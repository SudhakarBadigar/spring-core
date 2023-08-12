package com.constructorInjection;

public class ContractEmp {

	private String contract_company;
	private ConstructorEmployee constructEmp;
	
	public ContractEmp(String contract_company, ConstructorEmployee constructEmp) {
		this.contract_company = contract_company;
		this.constructEmp = constructEmp;
	}

	@Override
	public String toString() {
		return "ContractEmp [contract_company=" + contract_company + ", constructEmp=" + constructEmp + "]";
	}
	
}
