package com.sgtesting.instancevariable;
class Laptop
{
	String name;
	int price;
	String place;
}
class Desktop
{
	String Version;
	int price;
	String place;
}
class Mobile
{
	String place;
	String name;
	int price;
}
public class InstanceDemo2 {

	public static void main(String[] args)
	{
		Laptop obj1=new Laptop();
		obj1.name="Dell";
		obj1.price=1000;
		obj1.place="tumkur";
		System.out.println("Name:"+obj1.name);
		System.out.println("Price:"+obj1.price);
		System.out.println("Place:"+obj1.place);
		System.out.println("+++++++++++++++++++++++++++++++++");

		Desktop obj2=new Desktop();
		obj2.Version="windows10";
		obj2.price=123;
		obj2.place="tumkur";
		System.out.println("Vesion:"+obj2.Version);
		System.out.println("Price:"+obj2.price);
		System.out.println("Place:"+obj2.place);
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		Mobile obj3=new Mobile();
		obj3.place="tumkur";
		obj3.name="MotoG5";
		obj3.price=22;
		System.out.println("Place:"+obj3.place);
		System.out.println("Name:"+obj3.name);
		System.out.println("Price:"+obj3.price);
		System.out.println("+++++++++++++++++++++++++++++++++");
	}

}
