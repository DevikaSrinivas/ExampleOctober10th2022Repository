package com.sgtesting.constructor;
class Employee1
{
	String name;
	String place;
	String company;
	int age;
	Employee1(String Name,String Place,String Company,int age)
	{
		
		name=Name;
		place=Place;
		this.age=age;
		System.out.println("Name:"+name);
		System.out.println("Place:"+place);
		System.out.println("age:"+age);
	}
	
	void display()
	{
		System.out.println("-------------------------------");
		System.out.println(name);
		System.out.println(place);
		System.out.println(age);
	}
}
public class ConstructorUSingThis {

	public static void main(String[] args) 
	{
		Employee1 obj=new Employee1("Srinivas","banglore","Tcs",12);
		obj.display();
	}

}
