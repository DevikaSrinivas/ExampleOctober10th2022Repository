package com.sgtesting.thisoperator;
class Employee
{
	String name;
	String place;
	int age;
	Employee(String name,String eplace,int eage)
	{
		this.name=name;
		place=eplace;
		age=eage;

		System.out.println("name:"+name);
		System.out.println("eplace:"+place);
		System.out.println("eage:"+age);
	}
	void display()
	{
		System.out.println("name:"+name);
		System.out.println("eplace:"+place);
		System.out.println("eage:"+age);
	}
}

public class EmployeeDemo
{

	public static void main(String[] args) 
	{
		Employee obj=new Employee("Devika","tumkur",12);
		obj.display();
	}

}
