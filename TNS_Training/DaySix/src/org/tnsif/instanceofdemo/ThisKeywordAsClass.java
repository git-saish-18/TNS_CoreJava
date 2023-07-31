package org.tnsif.instanceofdemo;


class Team
{
	public int size;
	Team()
	{
		this(10);
		this.display(100);
		System.out.print("Default constructor");
	}
	Team(int size)
	{
		System.out.println(" Parameterized constructor "+size);
	}
	public void display(int size)
	{
		System.out.println(" Display Metthod "+size);
	}
}
public class ThisKeywordAsClass {

	public static void main(String[] args) {
		Team s=new Team();

	}

}
