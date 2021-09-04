package com.techment.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //bean id="employee" class="com.techment.Employee"></bean>
public class Employee {
	
	@Autowired      
	Address address;
	
	public void  displayEmployeeDetails()
	{
		address.addressDetail();
	}
}

//because of autowired address automatically inject in employee class
//Component automatically create object for that class
