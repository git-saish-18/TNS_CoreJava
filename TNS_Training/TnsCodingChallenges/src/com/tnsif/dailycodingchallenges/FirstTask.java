package com.tnsif.dailycodingchallenges;
import java.util.Scanner;
public class FirstTask {
	
	public static void Solution()
	{
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter the Count of number ");
		int n=cin.nextInt();
		boolean flag=false;
		int pinkyNum[]=new int [n];
		System.out.println("Pinky Number\n");
		for(int i=n-1;i>=0;i--)
		{
			pinkyNum[i]=cin.nextInt();
		}
	
		System.out.println("Mary Number\n");
		for(int i=0;i<n;i++)
		{
			if(cin.nextInt()!=pinkyNum[i])
			{
				flag=true;
			}
		}
		if(flag)
		{
			System.out.println("No, it is not in reverse order");
		}
		else
		{
			System.out.println("Yes, it is in reverse order");
		}
		cin.close();
	}

	public static void main(String[] args) {
		Solution();

	}

}
