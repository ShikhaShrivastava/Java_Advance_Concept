package com.techment.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.techment.service.DataBaseService;

public class ClientApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.techment");
		context.refresh();
		
		DataBaseService dbservice=(DataBaseService) context.getBean("dataBaseService");
		dbservice.displayDatabaseInfo();
	}

}
