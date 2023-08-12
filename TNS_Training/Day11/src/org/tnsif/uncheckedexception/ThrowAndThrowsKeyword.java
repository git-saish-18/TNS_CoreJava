package org.tnsif.uncheckedexception;

import java.io.IOException;

public class ThrowAndThrowsKeyword {

	public static void isEligible(int age,int weight) throws Exception
	
	{
		if(age>18 && weight>50)
		{
			System.out.println("Eligible");
		}
		else
			
		{
			throw new ArithmeticException("Not Eligible");
		}
	}
	public static void main(String[] args) {
		try
		{
			
			isEligible(19,50);
		}catch(Exception s)
		{
			System.out.println(s);
		}

		
	}

}
