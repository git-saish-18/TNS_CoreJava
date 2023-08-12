package org.tnsif.staticvariable;

class MyClass
{
	int num;
	static String name;
	static
	{
		// We can't initialize non static variable in static block
//		num=10;
		name="saish";
		System.out.println(name);
		
	}
	MyClass()
	{
		System.out.print("I am constructor");
	}
}



public class StaticBlock {
	static void MyStaticMethod()
	{
		
		System.out.println(MyClass.name);
	}

	public static void main(String[] args) {
//		MyClass a=new MyClass();
//		MyClass.MyStaticMethod();

	}


}
