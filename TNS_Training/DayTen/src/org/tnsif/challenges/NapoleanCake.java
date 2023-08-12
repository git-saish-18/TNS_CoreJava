package org.tnsif.challenges;

public class NapoleanCake {

	public static void Solve(int arr[])
	{
		int temp=arr[arr.length-1];
		int ans[]=new int[arr.length];
		for(int i=arr.length-1;i>=0;i--)
		{
			if(temp!=0 || arr[i]!=0)
			{
				ans[i]=1;
				if(temp<arr[i])
				{
					temp=arr[i];
				}
				else
				{
					temp=arr[i];
				}
			}
		}
		for(int a:ans)
		{
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solve(new int[] { 0, 3, 0, 0, 1, 3 });

	}

}
