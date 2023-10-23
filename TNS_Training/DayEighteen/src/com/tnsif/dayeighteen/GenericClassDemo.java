package com.tnsif.dayeighteen;

public class GenericClassDemo {

	public static void main(String[] args) {
		Repo<Integer> objone=new Repo<>();
		objone.setData(29);
		System.out.println(objone.getData());
		
		Repo<String> objtwo=new Repo<>();
		objtwo.setData("saish");
		System.out.println(objtwo.getData());
		
		Repo<Student> objthree=new Repo<>();
		objthree.setData(new Student(1,"saish"));
		System.out.println(objthree.getData());

	}

}
