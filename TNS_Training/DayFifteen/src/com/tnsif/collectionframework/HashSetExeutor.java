package com.tnsif.collectionframework;

import java.util.HashSet;

public class HashSetExeutor {

	public static void main(String[] args) {
		HashSet<Integer> myset1=new HashSet<>();
		myset1.add(10);
		myset1.add(13);
		myset1.add(12);
		myset1.add(11);
		System.out.println(myset1);
		
		HashSet<Integer> myset2=new HashSet<>();
		myset2.add(10);
		myset2.add(13);
		myset2.add(12);
		myset2.add(11);
		myset2.addAll(myset1);
		System.out.println(myset2);
		

	}

}
