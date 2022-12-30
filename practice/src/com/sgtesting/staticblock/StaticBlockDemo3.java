package com.sgtesting.staticblock;
class Demo2

{
	static
	{
		System.out.println("It is a first  static block");
	}
	static
	{
		System.out.println("it is a second static block");
	}
}
public class StaticBlockDemo3 {

	public static void main(String[] args)
	{
		Demo2 obj=new Demo2();

	}

}
