package org.tnsif.singlediamentionalarray;
import java.util.*;
public class ArrayExample {

	public static void MaxEle()
	{
		Scanner get=new Scanner(System.in);
		System.out.println("\nEnter the size of array ");
		int arr[]=new int[get.nextInt()];
		
		System.out.println("\nEnter Element of  array ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=get.nextInt();
		}
		int min=arr[0];
		int max=arr[arr.length-1];
		for(int a:arr)
		{
			max=a>max?a:max;
			min=a>min?min:a;
		}
		System.out.println(max+" "+ min);
	}
		
	public static void main(String[] args) {
//		int arr[]= {1,2,3,4,5,6};
//		for(int num:arr)
//		{
//			System.out.println(num);
//		}
		MaxEle();

	}
	

}
