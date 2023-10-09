package com.tnsif.collectionframework;

import java.util.HashMap;

public class HashMapExceutor {

	public static void main(String[] args) {
		HashMap<Integer,String> myMap=new HashMap<>();
		myMap.put(1,"saish");
		myMap.put(2,"Ashu");
		myMap.put(4,"Darshan");
		myMap.put(5,"Abhi");
		
		
		System.out.println(myMap);
		myMap.put(5,"abhishek");
		
		System.out.println(myMap);
		myMap.put(6,null);
		System.out.println(myMap);
	}
	

}
