package org.tsnif.interfacedemo;

public class MyInternfaceExceutor implements DebitCard {
	
	public void MyAbstractMethod()
	{
		System.out.println("I am abstract method ");
	}
	static
	{
		System.out.println("My banck Id "+DebitCard.cardNo);
	}
	public static void main(String[] args) {
		
		MyInternfaceExceutor myobj=new MyInternfaceExceutor();
		myobj.MyAbstractMethod();
		myobj.MyDefaultMethod();
		DebitCard.MySaticMethod();
		
		
		
	}

}
