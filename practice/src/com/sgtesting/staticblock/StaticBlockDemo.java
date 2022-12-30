package com.sgtesting.staticblock;
class Test
{
	static String name;
	static int age;
	static
	{
		
		
		Test.showName();
		Test.showAge();
	}
	static void showName()
	{
		name="devika";
		
		System.out.println("Name of employee : "+name);
	}
	static void showAge()
	{
		age=12;
		System.out.println("age of the Employee : "+age);
	}

}

public class StaticBlockDemo {

	public static void main(String[] args)
	{
		Test n=new Test();		
		
		
	}

}




