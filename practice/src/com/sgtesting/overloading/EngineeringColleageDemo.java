package com.sgtesting.overloading;
class Laptop
{
	Laptop(String name,String place)
	{
		System.out.println("Name:"+name);
		System.out.println("Place:"+place);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	}
	Laptop(String version,int price)
	{
		System.out.println("Model:"+version);
		System.out.println("Price:"+price);
	}
}
public class EngineeringColleageDemo {

	public static void main(String[] args)
	{	
		Laptop obj=new Laptop("Dell","banglore");
		Laptop obj1=new Laptop("windowsfamily",1000);

	}

}
