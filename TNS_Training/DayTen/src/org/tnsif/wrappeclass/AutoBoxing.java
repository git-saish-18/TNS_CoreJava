package org.tnsif.wrappeclass;

// autoboxing use to convert primitive data type in the object type
public class AutoBoxing {

	public static void main(String[] args) {
		int num=19;
		int num1=19;
		// convert primitive type to object
		Integer s=num;
		Integer s1=num1;
		
		System.out.println(s.equals(s1));
		System.out.println(s.getClass().getName());
		
	}

}
