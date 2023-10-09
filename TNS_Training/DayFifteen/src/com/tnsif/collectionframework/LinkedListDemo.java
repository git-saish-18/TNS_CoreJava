package com.tnsif.collectionframework;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> mylist=new LinkedList<>();
		mylist.add(10);
		mylist.add(12);
		mylist.addFirst(13);
		mylist.addLast(15);
		System.out.println(mylist);
		System.out.println("First Element "+mylist.getFirst());
		System.out.println("Last Element "+mylist.getLast());
		
		
		Iterator<Integer> it=mylist.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		ListIterator<Integer> listit=mylist.listIterator();
		while(listit.hasNext())
		{
			System.out.print(listit.next()+" ");
		}
		while(listit.hasPrevious())
		{
			System.out.print(listit.previous()+" ");
		}
		listit=mylist.listIterator(mylist.size());
		while(listit.hasPrevious())
		{
			System.out.print(listit.previous()+" ");
		}
		
				
		
	}

}
