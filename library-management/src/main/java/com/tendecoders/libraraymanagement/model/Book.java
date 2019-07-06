package com.tendecoders.libraraymanagement.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Book {
	@Id @GeneratedValue
	private int bookid;
	private String name;
	private String author;
	private int price;
//	 Book() {
//		
//	}
//	public void book(int bookid, String name, String  author, int price) {
//		this.bookid=bookid;
//		this.name=name;
//		this.author=author;
//		this.price=price;
//		
//	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}