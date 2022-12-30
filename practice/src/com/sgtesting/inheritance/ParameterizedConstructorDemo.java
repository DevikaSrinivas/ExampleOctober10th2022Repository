package com.sgtesting.inheritance;
class A
{
	A(String name,int age)
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
class B extends A
{
	B(String place)
	{
		super("devika",12);
		System.out.println("Place:"+place);
	}
}
public class ParameterizedConstructorDemo {

	public static void main(String[] args) {
		B obj=new B("tumkur");
		
	}

}
