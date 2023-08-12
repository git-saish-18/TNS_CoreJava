package org.tnsif.challenges;

public class MultiplicationOfArray {

	public static void MulArr(int arr[])
	{
		int mul=1;
		for(int a:arr)
		{
			mul*=a;
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=mul/arr[i];
		}
		for(int s:arr)
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		MulArr(new int[] {2,3,4,5});

	}

}
