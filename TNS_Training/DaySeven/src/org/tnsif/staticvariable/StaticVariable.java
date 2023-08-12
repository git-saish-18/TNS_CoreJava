package org.tnsif.staticvariable;


class Employee
{
	int empId;
	static String compName="TNSIF";
	String empName="Saish";	
	
	public static void show()
	{
		System.out.println(compName);
		
		//  we cannot access non static variable within static method
		// System.out.println(empName);  --->   error 
	}
}
public class StaticVariable {

	public static void main(String[] args) {
		
		Employee em=new Employee();
		Employee.compName="Google";
		
		// we cannot access static method with object of class  
//		em.show();
		
//		2 way
		Employee.show();
	}

}
