package org.tnsif.lopping;
import java.util.*;
public class Rectangle {
	public static void main(String args[])
	{
		Scanner get=new Scanner(System.in);
		int n=get.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
}
