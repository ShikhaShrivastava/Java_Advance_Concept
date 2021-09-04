
package com.techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class GoodDayGreeting implements IGreeting {
	String greeting="Have a Good Day";
	@Override
	public String greet() {
		return greeting;
	}
	
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	

}
