package com.techment.modal;

public class Employee {
	
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	public Employee(String name) {
		super();
		this.name = name;
		System.out.println("Name constructor called");
	}


	public Employee(int salary) {
		super();
		this.salary = salary;
		System.out.println("Salary constructor called");
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
