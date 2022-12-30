package com.sgtesting.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		//addelements();
		//removeelements();
		//readelements1();
		//readelements2();
		//readElementsByIterator();
		withOutGenrics();
	}
	private static void addelements()
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		System.out.println("elements:"+obj);
		obj.add(10);
		obj.add(20);
		obj.add(1, 60);
		System.out.println("elements:"+obj);
		ArrayList<Integer> obj1=new ArrayList<Integer>();
		obj1.add(90);
		obj1.add(5);
		obj.addAll(obj1);
		System.out.println("elements:"+obj);
	}
	private static void removeelements()
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		System.out.println("elements:"+obj);
		obj.add(5);
		obj.add(0, 10);
		obj.add(20);
		System.out.println("elements:"+obj);
		obj.remove(1);
		System.out.println("elements:"+obj);
		obj.remove(Integer.valueOf(10));
		System.out.println("elements:"+obj);
		obj.removeAll(obj);
		System.out.println("elements:"+obj)	;
	}
	private static void readelements1()
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		System.out.println("elements:"+obj);
		for(int a:obj)
		{
			System.out.println(a);
		}
	}
	private static void readelements2()
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(100);
		obj.add(200);
		obj.add(300);
		System.out.println("elements:"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	private static void readElementsByIterator()
	{
		ArrayList<Integer> obj=new ArrayList<Integer>();
		System.out.println("Elements:"+obj);
		obj.add(10);
		obj.add(20);
		obj.add(1, 50);
		System.out.println("Elements:"+obj);
		Iterator<Integer> ite=obj.iterator();
		while(ite.hasNext());
		{
			System.out.println(ite.next());
		}
	}
	private static void withOutGenrics()
	{
		ArrayList obj=new ArrayList();
		System.out.println("Elements:"+obj);
		obj.add(10);
		obj.add("Java");
		obj.add('A');
		obj.add("True");
		System.out.println("elements:"+obj);
		
	}

}
