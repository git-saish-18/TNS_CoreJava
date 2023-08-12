package org.tnsif.challengesDaySeven;

public class MovieShow {
	
	public static void PriceMovieTicket(int age,double d)
	{
		if(age>13)
		{
			if(d==10.15 || d==13.30)
			{
				System.out.println("$"+8);
			}else if(d==18.00 || d==22.00 )
			{
				System.out.println("$"+4);
			}else
			{
				System.out.println("Mention appropriate show time");
			}
		}
		else
		{
			if(d==10.15 || d==13.30)
			{
				System.out.println("$"+4);
			}else if(d==18.00 || d==22.00 )
			{
				System.out.println("$"+2);
			}else
			{
				System.out.println("Mention appropriate show time");
			}
		}
	}
	public static void main(String[] args) {
		PriceMovieTicket(12,13.30);

	}

}
