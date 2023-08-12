package org.tnsif.uncheckedexception;

public class FinallyBlockNotExecuted {

	
	public static void Array(int num[])
	{
		try
		{	
			System.out.println(num[4]);
//			System.exit(0);
		}
		catch(ArrayIndexOutOfBoundsException s)
		{
			System.out.println("Pakad liya ");
//			System.exit(0);
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
		// TODO Auto-generated method stub
		Array(new int[] {1,2,3});
	}

}
