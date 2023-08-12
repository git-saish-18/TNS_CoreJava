package org.tnsif.singlediamentionalarray;

public class Employee {

	int id;
	int salary;
	String name ;
	Employee(int id,int salary,String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	public String toString()
	{
		return "Employee id "+id+"\nEmployee name "+name+"\nEmployee salary "+salary;
	}

	public static void main(String[] args) {
		Employee e1=new Employee(10,1000,"saish");
		Employee e2=new Employee(11,1001,"Abhi");
		Employee e3=new Employee(12,1002,"Sandy");
		
		Employee emp[]= {e1,e2,e3};
		
		for(Employee emps:emp)
		{
			System.out.println(emps);
			System.out.println(".....");
		}
	}

}
