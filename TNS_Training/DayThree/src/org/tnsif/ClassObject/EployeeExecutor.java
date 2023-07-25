package org.tnsif.ClassObject;

public class EployeeExecutor {

	public static void main(String[] args) {
		Employee s1= new Employee(3456, "Saish", 78.45f, "Comp");
		s1.show();
		Employee s2=new Employee();
		Employee s3= new Employee(112, "Onkar", 78.45f, "IT");
		Employee s4=new Employee(s3);		
	
	}

}
