package com.oops.bll;

public class Author {
	public String firstName;
	public String lastName;
	public String bookName;
	
	public Author() {
		//default constructor
	}
	
	public Author(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public Author(String firstName,String lastName,String bookName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getBookName() {
		return bookName;
	}
	@Override
	public String toString() {
		return "" + "Book name: "+ bookName +" "+"Author: "+ firstName+" "+" " +lastName;
		
	}
	

}
