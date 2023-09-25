package com.tnsif.dailycodingchallenges;

public class WoodenBero extends Bero{
	private String woodType;
	
	// Constructor for initialize the wooden bero details
	public WoodenBero(String beroType,String beroColour,String woodType)
	
	{
		super(beroType,beroColour);
		this.woodType=woodType;
	}
	
	// getter for woodType
	public String getWoodType() {
		return woodType;
	}

	// setter for woodType
	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}
	
	// calculation of Price based on the woodType
	public void calculatePrice()
	{
		if(woodType=="Ply Wood")
		{
			this.setPrice(15000);
		}
		else if(woodType=="Teak Wood")
		{
			this.setPrice(12000);
		}
		else if(woodType=="Engineered Wood")
		{
			this.setPrice(10000);
		}
	}
}
