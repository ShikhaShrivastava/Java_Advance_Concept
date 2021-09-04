package com.test;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Library101")
public class Library {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	int lid;
	String lname;
	
	@OneToMany(mappedBy = "library", cascade = CascadeType.ALL) //mappedby define bidirectional assosiation bydefault consider it as unidirectional
	Set<Book> books;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	
	

}
