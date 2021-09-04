package com.techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Oracle implements IDao {

	@Override
	public void databaseName() {
		System.out.println("Connecting to Oracle Database");
	}

}
