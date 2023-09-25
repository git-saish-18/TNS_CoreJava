package com.tnsif.dailycodingchallenges;
import java.text.DecimalFormat;
public class UserInterface {
	double discount;
	
	
	// calculateDiscount for different bero types
	public double calculateDiscount(Bero bObj)
	{
		if(bObj.beroType=="Steel Bero")
		{
			discount=bObj.getPrice()*0.1;
		}
		else if(bObj.beroType=="Wooden Bero")
		{
			discount=bObj.getPrice()*0.15;
		}
		else
		{
			System.out.println(bObj.beroType+" is an invalid bero type");
			return 0.0;
		}
		return discount;
		
	}
	
	// FinalcalculatePrice based on beroType
	public void FinalcalculatePrice(Bero bObj)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		
		if(calculateDiscount(bObj)!=0.0)
		{
			System.out.println("Final Cost "+df.format(bObj.getPrice()-calculateDiscount(bObj)));
			
		}
	}
	
	public static void main(String[] args) {
		
		// Cotructor & object of CustomerDetails
		CustomerDetails c1=new CustomerDetails("Saish",845966274,"shirdi");
		// object of  BeroType
		WoodenBero s1=new WoodenBero("Wooden Bero","Brown","Ply Wood");
		s1.calculatePrice();
		// object of UserInteerface
		UserInterface u1=new UserInterface();
		System.out.println(c1);
		u1.FinalcalculatePrice(s1);
		
		
		CustomerDetails c2=new CustomerDetails("Guru",789461230,"South Street");
		SteelBero s2=new SteelBero("Steel Bero","Blue",7);
		s2.calculatePrice();
		UserInterface u2=new UserInterface();
		System.out.println(c2);
		u2.FinalcalculatePrice(s2);
		
		
		CustomerDetails c3=new CustomerDetails("Guru",789461230,"South Street");
		SteelBero s3=new SteelBero("Cupboard","",7);
		s3.calculatePrice();
		UserInterface u3=new UserInterface();
		System.out.println(c3);
		u2.FinalcalculatePrice(s3);
		
		
	}

}
