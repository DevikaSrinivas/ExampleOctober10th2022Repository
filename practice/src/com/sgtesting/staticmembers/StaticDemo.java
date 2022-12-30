//If Static are available in a main class
package com.sgtesting.staticmembers;

public class StaticDemo
{
	static String firstname;
	static int price;
	static String place;
	public static void main(String[] args) 
	{
		firstname="Devika";
		price=1000;
		place="tumkur";
		System.out.println("Firstname:"+firstname);
		System.out.println("Price:"+price);
		System.out.println("Place:"+place);

	}

}
