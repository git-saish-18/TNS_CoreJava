package org.tnsif.jaggedarray;
/*given aaray number of n integer wherer n is greater than 1  return an aaray otp such that opt of ith 
 * index id eqaual to product of all element of nums except that integer*/

//input [1,2,3,4]
//output [24,12,8,6]


import java.util.Scanner;

public class MyJaggedArr {

	public static void main(String[] args) {
		Scanner get=new Scanner(System.in);
		
//		declaration of jagged array
		
		int arr[][]=new int[3][];
		
		arr[0]=new int[2];
		arr[1]=new int[3];
		arr[2]=new int[1];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=get.nextInt();
			}
		}
		for(int arr1[]:arr)
		{
			for(int a:arr1)
			{
				System.out.println(a);
			}
		}
	}

}
