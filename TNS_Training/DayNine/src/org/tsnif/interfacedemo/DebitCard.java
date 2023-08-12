package org.tsnif.interfacedemo;

public interface DebitCard {
	static int id=10;
	int cardNo=232424422;
	void MyAbstractMethod();
	static void MySaticMethod()
	{
		System.out.println("My Id "+id);

	}
	
	default void MyDefaultMethod()
	{	
		System.out.println("I am default method ");

	}
}
