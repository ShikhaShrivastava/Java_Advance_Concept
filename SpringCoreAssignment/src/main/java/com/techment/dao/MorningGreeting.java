package com.techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MorningGreeting implements IGreeting {
	String greeting="Good Morning";

	@Override
	public String greet() {
		return greeting;
	}
	
	public MorningGreeting() {
		
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

}
