package com.sgtesting.inheritance;
class Sample111
{
	void getres(String name)
	{
		System.out.println("Name:"+name);
	}
}
class Sample222 extends Sample111
{
	void getres1(String place)
	{
		System.out.println("Place:"+place);
	}
}
class Sample333 extends Sample222
{
	void getres2(int age)
	{
		System.out.println("Age:"+age);
	}
}
public class Assignments2 {

	public static void main(String[] args) 
	{
		Sample333 obj=new Sample333();
		obj.getres2(12);
		obj.getres1("tumkur");

	}

}
