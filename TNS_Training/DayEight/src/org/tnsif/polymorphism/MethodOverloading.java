package org.tnsif.polymorphism;
class Bollywood
{
	public static void showCouple(String str1, String str2)
	{
		System.out.println(str1 +" loves "+str2);
	}
	public static void showCouple(String str1,String str2,String str3)
	{
		System.out.println(str1 +" loves "+str2+" as well as "+str3);
	}
}
public class MethodOverloading {
	
	public static void main(String args[])
	{
		String Str1="salman";
		String Str2="Aishwarya";
		String Str3="Katrina";
		Bollywood.showCouple(Str1,Str2);
		Bollywood.showCouple(Str1,Str2,Str3);
	}
	
	
	
	
	
	
	
	

}
