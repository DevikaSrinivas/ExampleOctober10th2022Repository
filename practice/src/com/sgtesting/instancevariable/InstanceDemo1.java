package com.sgtesting.instancevariable;
class Fruits
{
	String name;
	int price;
	String place;
}
class Vegetables
{
	String name;
	String place;
	int price;
}
class Flowers1
{
	String name;
	String place;
	int price;
}
public class InstanceDemo1 {

	public static void main(String[] args)
	{
		Fruits obj=new Fruits();
		obj.name="Apple";
		obj.price=12;
		obj.place="tumkur";
		System.out.println("Name:"+obj.name);
		System.out.println("Price:"+obj.price);
		System.out.println("Place:"+obj.place);
		System.out.println("++++++++++++++++++++++++++++++");
		
		Vegetables obj1=new Vegetables();
		obj1.name="Beans";
		obj1.place="Banglore";
		obj1.price=123;
		System.out.println("Name:"+obj1.name);
		System.out.println("Place:"+obj1.place);
		System.out.println("Price:"+obj1.price);
		System.out.println("++++++++++++++++++++++++++++++");
		
		Flowers1 obj2=new Flowers1();
		obj2.name="Rose";
		obj2.place="Banglore";
		obj2.price=12;
		System.out.println("Name:"+obj2.name);
		System.out.println("Place:"+obj2.place);
		System.out.println("Price:"+obj2.price);
		System.out.println("++++++++++++++++++++++++++++++");
	}

}
