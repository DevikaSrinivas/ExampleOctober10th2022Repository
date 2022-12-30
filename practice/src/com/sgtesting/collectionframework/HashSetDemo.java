package com.sgtesting.collectionframework;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args)
	{
		addElements();
		//removeElements();
	}
	private static void addElements()
	{
		HashSet<String> obj=new HashSet<String>();
		System.out.println("Elemnts:"+obj);
		obj.add("Red");
		obj.add("Black");
		obj.add("Green");
		obj.add("Blue");
		System.out.println("elements:"+obj);
		//HashSet<Integer> obj1=new HashSet<Integer>();
		//obj1.add(100);
		//obj1.add(200);
		//obj.addAll(obj1);
		//System.out.println("elements:"+obj);	
	}
	private static void removeElements()
	{
		HashSet<Integer> obj=new HashSet<Integer>();
		System.out.println("Elemnts:"+obj);
		obj.add(20);
		obj.add(10);
		obj.add(30);
		obj.add(60);
		System.out.println("elements:"+obj);
		obj.remove(1);
		System.out.println("elements:"+obj);
		//obj.remove(2);
		//System.out.println("elements:"+obj);
	}

}
