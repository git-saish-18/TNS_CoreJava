package org.tnsif.uncheckedexception;

public class CatchBlockDemo {

	public static void Array(int num[])
	{
		try
		{	
			System.out.println(10/0);
			System.out.println(num[4]);
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException err )
		{
			System.out.println("Pakad liya "+ err.getMessage());

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
//			System.out.println(num[4]);
			System.out.println("I am finally block");
		}
	}
	public static void main(String[] args) {
		Array(new int[] {1,2,3});
	}

}
