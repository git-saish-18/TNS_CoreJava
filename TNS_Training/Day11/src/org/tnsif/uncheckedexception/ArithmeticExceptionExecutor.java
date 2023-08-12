package org.tnsif.uncheckedexception;

import java.util.Scanner;

public class ArithmeticExceptionExecutor {
	public static void main(String aegd[])
	{
		Scanner get=new Scanner(System.in);
		int x=get.nextInt();
		int y=get.nextInt();
		try
		{
			int div=x/y;
			System.out.println(div);
			
		}
		catch(ArithmeticException arr)

		{
			System.out.println("pakad liya");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}
