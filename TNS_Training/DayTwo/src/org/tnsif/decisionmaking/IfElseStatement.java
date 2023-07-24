package org.tnsif.decisionmaking;
import java.util.*;
public class IfElseStatement {

	public static void main(String[] args) {
		Scanner get=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age=get.nextInt();
		System.out.println("Enter the Weight");
		int Weight=get.nextInt();
		if(age>18 && Weight>45)
		{
			System.out.println("Eligible to donate the blood");
		}
		else
		{
			System.out.println("Not Eligible to donate the blood");
		}

	}

}
