package com.sgtesting.collectionframework;

import java.util.Stack;

public class StackDemo {
public static void main(String[] args) 
	{
		Stack st=new Stack();
		pushDemo(st, 10);
		pushDemo(st,20);
		pushDemo(st,40);
		popDemo(st);

	}
	private static void pushDemo(Stack st,int a)
	{
		st.push(a);
		System.out.println("elements:"+a);
	}
	private static void popDemo(Stack st)
	{
		int a=(int)st.pop();
		System.out.println("removed:"+a);
	}


}
