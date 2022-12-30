package com.sgtesting.instancevariable;

public class Person {
	int age;
	String name;
	public static void main(String[] args)
	{
		Person obj=new Person();
		obj.age=12;
		obj.name="devika";
		System.out.println("Age:"+obj.age);
		System.out.println("Name:+obj.name");
	}


}