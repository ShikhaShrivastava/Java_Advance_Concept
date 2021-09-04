package com.techment.modal;

public class Bank {
	String name;
	String ifseCode;
	String branch;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setIfseCode(String ifseCode) {
		this.ifseCode = ifseCode;
	}
	
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public void displayBankDetails()
	{
		System.out.println("Name: "+name);
		System.out.println("IFSC Code: "+ifseCode);
		System.out.println("Branch: "+branch);

	}
	
	
}
