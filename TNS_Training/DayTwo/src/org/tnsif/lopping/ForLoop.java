package org.tnsif.lopping;
import java.util.*;
public class ForLoop {
	
	public static void main(String args[])
	{
		Scanner get =new Scanner(System.in);
		System.out.println("Enter the Row");
		int row=get.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
