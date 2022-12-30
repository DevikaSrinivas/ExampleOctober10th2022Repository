package com.sgtesting.constructor;
class Student
{
	Student(String name)
	{
		System.out.println("Name:"+name);
	
	}
	Student(int age )
	{
		this("devika");
		System.out.println("Age:"+age);
		
	}
}
public class ConstructorChainingDemo {

	public static void main(String[] args) 
	{
		Student obj=new Student(21);
	}

}
