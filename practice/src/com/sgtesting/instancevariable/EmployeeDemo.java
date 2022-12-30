package com.sgtesting.instancevariable;
class Employe
{
	String name;
	String place;
	int number;
	Employe(String Name,String Place,int number)
	{
		name=Name;
		place=Place;
		this.number=number;
		System.out.println("Name"+name);
		System.out.println("Place"+place);
		System.out.println("number"+number);
	}
	void display()
	{
		System.out.println("Name"+name);
		System.out.println("Place"+place);
		System.out.println("number"+number);
	}
}
public class EmployeeDemo {

	public static void main(String[] args)
	{
		Employe obj=new Employe("devika","tumkur",20);
		obj.display();

	}

}
