package org.tnsif.abstractkeyword;

abstract public class Sandwich {
	void showReceipe()
	{
		System.out.print("I don't know how to make sandwich");
	}
	
	abstract void prepare();
	abstract void prepare(int num);
}

