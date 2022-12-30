package com.sgtesting.constructor;
class Person
{
	String name;
	int age;
	String place;
	Person(String Name,int Age,String Place)
	{
		name=Name;
		age=Age;
		place=Place;
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Place:"+place);
	}
	
}
public class ParametrizedConstrDemo {

	public static void main(String[] args) 
	{
		Person obj=new Person("Srinivas",12,"Tumkur");
	}

}
