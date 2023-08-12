package org.tnsif.dayfourchallenge;

public class Microwave {
	
	public static void CheckHeat(int item,int heatTime)
	{
		if(item==1)
		{
			System.out.println(heatTime);
		}
		else if(item==2)
		{
			System.out.println(heatTime+(heatTime*0.5));
		}
		else if(item==3)q
		{
			System.out.println(heatTime*2);
		}
		else
		{
			System.out.println("Not recommended to heat item");
		}
	}
	public static void main(String args[])
	{
		CheckHeat(3,10);
	}
}
