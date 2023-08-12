package org.tnsif.challengeofday;

import java.util.Scanner;

public class SumOfArrayExceptThatIndex {

	public static void task()
	{
		Scanner get=new Scanner(System.in);
		System.out.println("\nEnter the Number of TestCase ");
		int testcase=get.nextInt();
		while(testcase>0)
		{
			System.out.println("\nEnter the size of Array ");
			int N=get.nextInt();
			
			int arr[]=new int[N];
			int newArr[]=new int[N];
			int sum=0;
			System.out.println("\nEnter the value of Array \n");
			for(int i=0;i<N;i++)
			{
				arr[i]=get.nextInt();
				sum+=arr[i];
				
			}

			for(int i=0;i<newArr.length;i++)
			{
				newArr[i]=sum-arr[i];   
			}
			
			for(int value:newArr)
			{
				System.out.print(value+" ");
			}
			testcase--;
		}		
	}
	public static void main(String[] args) {
		   task();

	}

}
