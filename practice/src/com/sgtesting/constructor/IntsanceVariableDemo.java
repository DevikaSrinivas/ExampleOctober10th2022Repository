package com.sgtesting.constructor;
class Employee
{
	String name;
	String place;
	int age;
	Employee(String ename,String eplace,int eage)
	{
		name=ename;
		place=eplace;
		age=eage;
		System.out.println("ename:"+name);
		System.out.println("eplace:"+place);
		System.out.println("eage:"+age);
		
	}
	void display()
	{                               
		System.out.println("ename:"+name);
		System.out.println("eplace:"+place);
		System.out.println("eage:"+age);
	}
}

public class IntsanceVariableDemo {

	public static void main(String[] args) 
	{
		Employee obj=new Employee("devika","banglore",12);
	}

}
