package com.tnsif.dailycodingchallenges;


// Abstract class 
public abstract class Bero {
	
	// beroTypes
	protected String beroType;
	protected String beroColour;
	protected double price;
	
	// getter for BeroType
	public String getBeroType() {
		return beroType;
	}
	
	// setter for BeroType
	public void setBeroType(String beroType) {
		this.beroType = beroType;
	}
	
	// getter for BeroColour
	public String getBeroColour() {
		return beroColour;
	}
	// setter for BeroColour
	public void setBeroColour(String beroColour) {
		this.beroColour = beroColour;
	}
	// getter for Price
	public double getPrice() {
		return price;
	}
	//setter for Price
	public void setPrice(double price) {
		this.price = price;
	}
	
	// toString method to display bero Details
	public String toString()
	{
		return "beroType "+this.beroType+" beroColour "+this.beroColour+" price "+this.price;
	}
	
	// constructor of Bero to initialize bero data
	public Bero(String beroType,String beroColour )
	{
		this.beroType=beroType;
		this.beroColour=beroColour;
	}
	
	// Abstract Method
	public abstract void calculatePrice();
}
