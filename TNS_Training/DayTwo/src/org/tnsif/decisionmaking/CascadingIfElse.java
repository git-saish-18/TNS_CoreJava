package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadingIfElse {

	public static void main(String[] args) {
		Scanner get=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age1=get.nextInt();
		System.out.println("Enter the Age");
		int age2=get.nextInt();
		System.out.println("Enter the Age");
		int age3=get.nextInt();
		if(age1>age2 && age1>age2)
		{
			System.out.println(age1+" is greater");
		}
		else if(age2>age3 && age2>age1)
		{
		}
		else if(age2==age3 && age1==age2)
		{
			System.out.println("All have same age ");
		}
		else
		{
			System.out.println(age3+" is greater ");
		}
		get.close();

	}

}
