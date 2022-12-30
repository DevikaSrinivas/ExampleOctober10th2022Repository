package com.sgtesting.collectionframework;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		//addElements();
		//removeElements();
		//readElements1();
		//readElements2();
		//readElementsByIterator();
		withOutGenrics();
	}
	private static void addElements()
	{
		Vector<Integer> obj=new Vector<Integer>();
		System.out.println("Elements"+obj);
		obj.add(10);
		obj.add(20);
		obj.add(30);
		System.out.println("elements:"+obj);
		Vector<Integer> obj1=new Vector<Integer>();
		obj1.add(100);
		obj1.add(0, 90);
		obj.addAll(obj1);
		System.out.println("elements:"+obj);
	}
	private static void removeElements()
	{
		Vector<Integer>obj=new Vector<Integer>();
		System.out.println("elements:"+obj);
		obj.add(10);
		obj.add(20);
		obj.add(30);
		System.out.println("elements:"+obj);
		obj.remove(1);
		System.out.println("elements:"+obj);
		obj.remove(Integer.valueOf(30));
		System.out.println("elements:"+obj);
		obj.removeAll(obj);
		System.out.println("elements:"+obj);
		
	}
	private static void readElements1()
	{
		Vector<Integer>obj=new Vector<Integer>();
		System.out.println("elements:"+obj);
		obj.add(10);
		obj.add(20);
		obj.add(30);
		System.out.println("elements:"+obj);
		for(int a:obj)
		{
			System.out.println(a);
		}
	}
	private static void readElements2()
	{
		Vector<Integer>obj=new Vector<Integer>();
		System.out.println("elements:"+obj);
		obj.add(10);
		obj.add(20);
		obj.add(30);
		System.out.println("elements:"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));	
		}
	}
	private static void readElementsByIterator()
	{
		Vector<Integer>obj=new Vector<Integer>();
		System.out.println("elements:"+obj);
		obj.add(10);
		obj.add(20);
		obj.add(30);
		System.out.println("Elements:"+obj);
		Iterator<Integer> ite=obj.iterator();
		while(ite.hasNext());
		{
			System.out.println(ite.next());
		}
		
	}
	private static void withOutGenrics()
	{
		Vector obj=new Vector();
		obj.add(10);
		obj.add("java");
		obj.add("true");
		obj.add('y');
		System.out.println("elements:"+obj);
		
	}
}
