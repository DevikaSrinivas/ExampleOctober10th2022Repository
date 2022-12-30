package com.sgtesting.overloading;
class Laptop1
{
	Laptop1(String name,String place)
	{
		System.out.println("Name:"+name);
		System.out.println("Place:"+place);
	}
	Laptop1(String branch,int price)
	{
	System.out.println("Branch:"+branch);
	System.out.println("Price:"+price);
	}
}
public class LaptopDemo {

	public static void main(String[] args)
	{
		Laptop1 obj=new Laptop1("Devika","Banglore");
		Laptop1 obj1=new Laptop1("Basavanagudi",100);
	}

}
