package com.sgtesting.staticblock;
class Demo
{
	static
	{
		System.out.println("it is a static block......!!!!!!");
	}
	Demo()
	{
		System.out.println("It is a constructor....!!!!!!!!!!!!");
	}
}
public class StaticBlockDemo1 {

	public static void main(String[] args)
	{
		Demo obj=new Demo();

	}

}
