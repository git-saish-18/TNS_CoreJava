package org.tnsif.ClassObject;

public class Library {

	public long noOfBooks;
	public String bookName;
	public double price;
	
	public Library()
	{
		System.out.println("dafault constructor");
	}
	public Library(long noofBook,String bookName,double price )
	{
		this.noOfBooks=noofBook;
		this.bookName=bookName;
		this.price=price;
	}
	@Override
	public String toString()
	{
		return " noOfBooks "+noOfBooks+" bookName "+bookName+" price "+price;
	}
}
