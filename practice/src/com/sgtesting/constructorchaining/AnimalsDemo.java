package com.sgtesting.constructorchaining;
class Animals
{
	Animals(String name,String place)
	{
		System.out.println("Name:"+name);
		System.out.println("Place:"+place);
	}
	Animals(int price)
	{
		this("lion","Banglore");
		System.out.println("Price:"+price);
		
	}
}
public class AnimalsDemo {

	public static void main(String[] args)
	{
		Animals obj=new Animals(123);	
	}

}
