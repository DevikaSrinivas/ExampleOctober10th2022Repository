package com.sgtesting.staticblock;
class Example
{
	void getres(String firstname,int age)
	{
		System.out.println("FirstName:"+firstname);
		System.out.println("Age:"+age);
	}
	void getres(String place)
	{
		System.out.println("Place:"+place);
	}
	
}
class  Example1
{

	String name;
	int age;
	Example1()
	
	{ 
		Example obj=new Example();
		obj.getres("Priya", 30);
		obj.getres("kugrama");
		name="devika";
		age=12;
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
public class MethodOverloading {

	public static void main(String[] args)
	{
		Example1 obj1=new Example1();

	}

}
