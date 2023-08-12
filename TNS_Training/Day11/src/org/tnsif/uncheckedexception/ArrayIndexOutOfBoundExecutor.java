package org.tnsif.uncheckedexception;

import java.util.Scanner;

public class ArrayIndexOutOfBoundExecutor {
	public static void Array(int num[])
	{
		try
		{
			System.out.println(num[4]);
		}
		catch(ArrayIndexOutOfBoundsException s)
		{
			System.out.println("Pakad liya ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("I am finally block");
		}
	}
	public static void main(String aegd[])
	{
//		Array(new int[] {1,2,3});
	}
}
