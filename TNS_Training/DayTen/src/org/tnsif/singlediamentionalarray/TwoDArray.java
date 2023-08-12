package org.tnsif.singlediamentionalarray;

public class TwoDArray {

	public static void TwoD(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		
		TwoD(new int [][]{
			{1,2,4},
			{2,3,4}
	});
		
		
	}

}
