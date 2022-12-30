package com.sgtesting.inheritance;
class Aa
{
	String name;
	String place;
	Aa()
	{
		name="devika";
		place="tumkur";
		System.out.println("Name:"+name);
		System.out.println("Place:"+place);
	}
}
class Bb extends Aa
{
	String company;
	int price;
	Bb()
	{
		super();
		company="tcs";
		price=20;
		System.out.println("Company:"+company);
		System.out.println("Price:"+price);
	}
}
class Cc extends Bb
{
	int age;
	String role;
	Cc()
	{
		super();
		age=12;
		role="Software enginer";
		System.out.println("Age:"+age);
		System.out.println("Role:"+role);
	}
}
public class MultiLevelInheritanceDemo
{
	public static void main(String[] args)
	{
		Cc obj=new Cc();
	

		


	}

}
