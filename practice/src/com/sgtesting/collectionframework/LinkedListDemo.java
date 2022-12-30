package com.sgtesting.collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class LinkedListDemo {
	public static void main(String[] args)
	{
		//addElements();
		//removeElements();
		//readElements1();
		//readElements2();
		//readElementsBothDirection();
		//readElementByIterator();
		//withoutGenrics();
		queue();

	}
private static void addElements()
{
		LinkedList<Integer> obj=new LinkedList<Integer>();
		System.out.println("Elements:"+obj);
		obj.add(10);
		obj.add(20);
		obj.add(0, 40);
		System.out.println("Elements:"+obj);
		LinkedList<Integer> obj1=new LinkedList<Integer>();
		obj1.add(100);
		obj1.add(200);
		obj1.add(300);
		obj.addAll(obj1);
		System.out.println("elements:"+obj);
}
	private static void removeElements()
	{
		LinkedList<Integer> obj=new LinkedList<Integer>();
		System.out.println("elements:"+obj);
		obj.add(20);
		obj.add(Integer.valueOf(10));
		obj.remove(obj);
		System.out.println("Elements:"+obj);
	}
	private static void readElements1()
	{
		LinkedList<Integer> obj=new LinkedList<Integer>();
		System.out.println("elements:"+obj);
		obj.add(10);
		obj.add(20);
		obj.add(50);
		System.out.println("elements:"+obj);
		for(int k:obj)
		{
			System.out.println(k);
		}
	}
	private static void readElements2()
	{
		LinkedList<Integer> obj=new LinkedList<Integer>();
		System.out.println("elements:"+obj);
		obj.add(10);
		obj.add(20);
		obj.add(50);
		System.out.println("elements:"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	private static void readElementsBothDirection()
	{
		LinkedList<Integer> obj=new LinkedList<Integer>();
		System.out.println("elements:"+obj);
		obj.add(10);
		obj.add(20);
		obj.add(50);
		System.out.println("elements:"+obj);
		ListIterator<Integer> List=obj.listIterator();
		while(List.hasNext())
		{
			System.out.println(List.next());
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		while(List.hasPrevious())
		{
			System.out.println(List.previous());
		}
	}
	private static void readElementByIterator()
	{
		LinkedList<Integer> obj=new LinkedList<Integer>();
		System.out.println("elements:"+obj);
		obj.add(10);
		obj.add(20);
		obj.add(50);
		System.out.println("elements:"+obj);
		Iterator<Integer> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		
	}
	private static void withoutGenrics()
	{
		LinkedList obj=new LinkedList();
		System.out.println("elements:"+obj);
		obj.add(10);
		obj.add("Java");
		obj.add('Y');	
		System.out.println("Elements:"+obj);
	}
	private static void queue()
	{
		Queue<Integer> obj=new LinkedList<Integer>();
		System.out.println("elements:"+obj);
		obj.add(10);
		obj.add(20);
		obj.add(50);
		System.out.println("elements:"+obj);
		obj.remove();
		System.out.println("elements:"+obj);
	}
}
