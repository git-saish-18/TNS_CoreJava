package org.tnsif.instanceofdemo;

class Arithmetic
{
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
}
class Adder extends Arithmetic
{
	
}
public class JavaInheritanceProblem {

	public static void main(String[] args) {
	
		Adder s=new Adder();
		System.out.print(s.add(100, 300));
	}

}

