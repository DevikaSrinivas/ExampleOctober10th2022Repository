package com.sgtesting.methodoverloading;
class Student
{
	void display(int age)
	{
		System.out.println("Age"+ age);
	}
	void display(String sname)
	{
		System.out.println("Name"+ sname);
	}
}
public class MethodOverloadingDemo {

	public static void main(String[] args)
	{
		Student obj=new Student();
		obj.display(12);
	
		obj.display("devika");

	}

}
