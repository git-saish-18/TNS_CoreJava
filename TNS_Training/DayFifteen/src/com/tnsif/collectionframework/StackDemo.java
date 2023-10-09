package com.tnsif.collectionframework;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<Integer>();
		st.add(10);
		st.add(11);
		st.add(12);
		st.add(13);
		st.add(14);
		st.add(15);
		System.out.println(st.size());
		while(!st.isEmpty())
		{
			System.out.println(st.pop());
		}
		

	}

}
