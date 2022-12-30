package com.sgtesting.instancevariable;
class Animal
{
	String name;
	int age;
}
class Flowers
{
	String name;
	String place;
}
public class MainDemo {

	public static void main(String[] args)
	{
		Animal obj=new Animal();
		obj.name="dog";
		obj.age=11;
		System.out.println("Name"+obj.name);
		System.out.println("Age"+obj.age);
		
		Flowers obj1=new Flowers();
		obj1.name="Rose";
		obj1.place="tumkur";
		System.out.println("Name:"+obj.name);
		System.out.println("Place:"+obj1.place);
	
	}

}
