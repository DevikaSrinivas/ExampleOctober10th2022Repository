package com.sgtesting.overloading;
class Fruits
{
	Fruits(String name,String place)
	{
		System.out.println("Name:"+name);
		System.out.println("Place:"+place);
	}
	Fruits(int price)
	{
		System.out.println("Price:"+price);
	}

	
}
public class FruitsDemo {

	public static void main(String[] args)
	{
		Fruits obj=new Fruits("Apple","Banglore");
		Fruits obj1=new Fruits(10);
	}

}
