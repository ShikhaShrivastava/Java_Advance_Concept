package com.AssociationAssignment2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book001")
public class Book {
	
	@Id
	int bookId;
	String title;
	int price;
	
	public Book() {
		super();
	}
	public Book(int bookId, String title, int price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	

}
