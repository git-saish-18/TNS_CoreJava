package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExceutor {

	public static void main(String[] args) {
		LinkedHashSet<Integer> h1=new LinkedHashSet<>();
		h1.add(32);
		h1.add(34);
		h1.add(49);
		h1.add(12);
		System.out.println(h1);
		
		
		System.out.println(h1.contains(39));
		
		Iterator<Integer> it=h1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ArrayList<Integer> arr=new ArrayList<Integer>(h1);
		Collections.sort(arr);
		System.out.println(arr);
		
		
		
		LinkedHashSet<Customer> c1=new LinkedHashSet<>();
		c1.add(new Customer("saish","shirdi"));
		c1.add(new Customer("ashu","nashik"));
		c1.add(new Customer("darshan","satana"));
//		c1.add(new Customer(null,null));
		System.out.println(c1);
		
		
		ArrayList<Customer> arr1=new ArrayList<>(c1);
		Comparator<Customer> comp=(s1,s2)->{
		return s1.getCity().compareTo(s2.getCity());		
		};
		
		Collections.sort(arr1, comp);
		System.out.println(arr1);

	}

}
