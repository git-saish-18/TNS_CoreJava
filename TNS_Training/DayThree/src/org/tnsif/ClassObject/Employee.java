package org.tnsif.ClassObject;

 public class Employee {
	
	// default data members
	int EmpId;
	String EmpName;
	float Salary;
	String Department;
	
	// Default constructor
	Employee()
	{
		System.out.println("I am default Constructor");
		
	}
	Employee(int EmpId,String EmpName,float Salary,String Department)
	{
		this.EmpId=EmpId;
		this.EmpName=EmpName;
		this.Salary=Salary;
		this.Department=Department;
		
	}
	
	//Copy Constructor
	Employee(Employee s)
	{
		System.out.println("EmpId "+s.EmpId+" EmpName "+s.EmpName+" Salary "+s.Salary +" Department "+s.Department);
		
	}
	//  method definition
	void show()
	{
		System.out.println("EmpId "+EmpId+" EmpName "+EmpName+" Salary "+Salary +" Department "+Department);
	
	}
}