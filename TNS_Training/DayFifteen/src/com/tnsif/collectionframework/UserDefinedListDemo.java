package com.tnsif.collectionframework;

import java.util.ArrayList;

public class UserDefinedListDemo{

	public static void main(String[] args) {
		ArrayList<Student> Studentlist=new ArrayList<Student>();
		Studentlist.add(new Student("saish",1,32));
		Studentlist.add(new Student("Ashu",2,31));
		Studentlist.add(new Student("onkar",3,30));
		Studentlist.add(new Student("darshan",4,29));	
		System.out.println(Studentlist);
		
		
		
	}
	
}
