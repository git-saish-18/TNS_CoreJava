package org.tnsif.superkeyword;


class Parent
{
	public int number=122;
	public String name="Parent";
}
class child extends Parent
{
	
	public int number=212;
	public String name="Child";

	public void show()
	{
		/*
		 If parent class and child class variable name  are same to invoke the parent 
		 variable we have to use super keyword.
		 */
	System.out.println(super.name);
	System.out.println(name);
	}
}
class subchild extends child
{
	public void show()
	{
		/*
		 *
		 If parent class and child class method name are same to invoke the parent 
		 method we have to use super keyword.
		 */
		super.show();
		System.out.println("from parent "+super.name);
	
	}
}
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		child s=new child();
//		System.out.print(s.name);0
//		s.show();
subchild s1=new subchild();
s1.show();

		
	}

}
