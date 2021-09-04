package com.techment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.techment.dao.IGreeting;

@Service
public class GreeterService {
	
	@Autowired
	@Qualifier("goodDayGreeting")
	IGreeting ig;
	public void printGreeting() {
		System.out.println(ig.greet());
	}
	
	
}
