package com.tnsif.dailycodingchallenges;

public class SteelBero extends Bero{
	private int beroHeight;

	// getter for beroHeight
	public int getBeroHeight() {
		return beroHeight;
	}
	// setter for beroHeight
	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}
	// constructor for Steel bero to initialize bero Steel bero details
	public SteelBero(String beroType,String beroColour,int beroHeight)
	{
		super(beroType,beroColour);
		this.beroHeight=beroHeight;
	}
	// Calculation of Price based on beroHeight
	public void calculatePrice()
	{
		if(beroHeight==3)
		{
			this.setPrice(5000);
		}
		else if(beroHeight==5)
		{
			this.setPrice(8000);
		}
		else if(beroHeight==7)
		{
		   this.setPrice(10000);
		}
	}
}
