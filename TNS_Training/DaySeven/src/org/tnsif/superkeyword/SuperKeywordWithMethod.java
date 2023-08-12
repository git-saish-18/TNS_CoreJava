package org.tnsif.superkeyword;

class MET
{
	public int number=122;
	public String name="Parent";
	public void show()
	{
		/*
		 If parent class and child class variable name  are same to invoke the parent 
		 variable we have to use super keyword.
		 */
	System.out.println(name);
	}
}
class MetBkc extends MET
{
	public String name="Child";
	public void show()
	{
		/*
		 *
		 If parent class and child class method name are same to invoke the parent 
		 method we have to use super keyword.
		 */
		
		super.show();
		System.out.println(name);
		
	
	}
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		MetBkc ch=new MetBkc();
		ch.show();

	}

}
