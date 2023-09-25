package com.tnsif.dailycodingchallenges;

public class CustomerDetails {
	
	// CustomerDetails
	private String customerName;
	private long phoneNumber;
	private String address;
	
	// setter for Name
	public void setcustomerName(String customerName)
	{
		this.customerName=customerName;
	}
	//setter for phone number
	public void setphoneNumber(long phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}
    //	setter for Address
	public void setaddress(String address)
	{
		this.address=address;
	}
	
	// tostring method to print object 
	public String toString()
	{
		return "customer Name "+this.customerName+" PhoneNumber "+this.phoneNumber+" Address "+this.address;
	}
	
	// Parameterize constructor for initialize Customers Details
	public CustomerDetails(String name,long phnumber,String add)
	{
		this.customerName=name;
		this.phoneNumber=phnumber;
		this.address=add;
	}
}
