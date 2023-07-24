package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfStatement {

	public static void main(String[] args) {
		Scanner get=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=get.nextInt();
		System.out.println("Enter the Weight");
		int Weight=get.nextInt();
		if(age>11)
		{
			if(Weight>40)
			{
				System.out.println("Eligible For bunjee jumping");
				if(Weight>110)
				{
					System.out.println("Extra Robes will be added ");
				}
			}
			else
			{
				System.out.println("Not Eligible ");
			}
		}
		
		get.close();

	}

}
