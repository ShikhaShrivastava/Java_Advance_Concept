package com.techment.modal;

public class Department {
	
	String hodName;
	
	
	public void setHodName(String hodName) {
		this.hodName = hodName;
	}


	void deptDetails()
	{
		System.out.println("This is department details.");
		System.out.println("There should be 6 department");
		System.out.println("Hod Name: "+hodName);
	}
}
