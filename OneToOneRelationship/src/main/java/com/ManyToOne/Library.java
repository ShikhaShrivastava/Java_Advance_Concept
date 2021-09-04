package com.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="library500")
public class Library {
	
	@Id
	int lid;
	String name;
	
	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(int lid, String name) {
		super();
		this.lid = lid;
		this.name = name;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
