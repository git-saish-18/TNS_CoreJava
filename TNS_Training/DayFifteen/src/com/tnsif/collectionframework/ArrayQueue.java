package com.tnsif.collectionframework;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayQueue {

	public static void main(String[] args) {
		ArrayDeque<Integer> myQue=new ArrayDeque<>();
		myQue.addFirst(10);
		myQue.addFirst(11);
		myQue.addFirst(12);
		myQue.addFirst(13);
		System.out.println(myQue);
		System.out.println("Get Last "+myQue.peekLast());
		System.out.println("Remove ele "+myQue.remove());
		
		Iterator<Integer> it=myQue.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
