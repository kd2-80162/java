/* . Use TreeSet to store all books in descending order of price. Natural ordering for the Book should be isbn (do not change it). Display them using iterator()
and descendingIterator().*/

package com.sunbeam;

import java.util.Objects;
import java.util.Scanner;

public class Book implements Comparable <Book>{
	private String isbn;
	private Double price;
	private String AuthorName;
	private int quantity;
	
	public Book()
	{
		
	}
	
	
	public Book(String isbn, Double price, String AuthorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.AuthorName =AuthorName;
		this.quantity = quantity;

		
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getAutthorName() {
		return AuthorName;
	}

	public void setAutthorName(String AuthorName) {
		AuthorName = AuthorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void accept()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Data");
		System.out.println("Enter the Isbn");
		this.isbn=sc.next();
		System.out.println("Enter the Price");
		this.price=sc.nextDouble();
		System.out.println("Enter the AuthorName");
		this.AuthorName=sc.next();
		System.out.println("Enter the Quantity");
		this.quantity=sc.nextInt();
	}
	
	
	
	
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", AutthorName=" + AuthorName + ", quantity=" + quantity
				+ ", getIsbn()=" + getIsbn() + ", getPrice()=" + getPrice() + ", getAutthorName()=" + getAutthorName()
				+ ", getQuantity()=" + getQuantity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	public int hashCode()    //Duplicates Values are avoided using Hash Code
	{
		int hash=Objects.hash(this.isbn);
				return hash;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(obj instanceof Book ) 
		{
			Book other=(Book)obj;
		if (this.isbn.equals(other.isbn))
		return true;
	}
		return false;
	
		
	
	
	}


	@Override
	public int compareTo(Book other) {
		int diff=other.isbn.compareTo(isbn);
		return diff;
	}


	

}
	
	
	