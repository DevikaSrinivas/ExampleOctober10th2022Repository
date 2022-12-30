package com.sgtesting.staticblock;

class Demo1
{
	{
		System.out.println("it is a Instance Block");
	}
	static
	{
		System.out.println("it is a static block");
	}
	Demo1()
	{
		System.out.println("it is a constructor ");
	}
}

public class SaticBlockDemo2 {

	public static void main(String[] args)
	{
		Demo1 obj=new Demo1();
	}

}
