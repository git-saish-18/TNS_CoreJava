package org.tnsif.instanceofdemo;

class Director
{
	String name;
	void print()
	{
		this.name="Saish Thorat";
		this.display(name);
	}
	void display(String Name)
	{
		System.out.print(Name);
	}
}
public class ThisKeywordDemoFour {

	
	public static void main(String[] args) {
		Director s=new Director();
		s.print();
		

	}

}
