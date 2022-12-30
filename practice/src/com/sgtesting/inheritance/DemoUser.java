package com.sgtesting.inheritance;
class Student
{
	Student(String branchname,String firstname)
	{
		System.out.println("Branchname:"+branchname);
		System.out.println("FirstName:"+firstname);
	}
}
class EnggStudent extends Student
{
	EnggStudent(String bn, String fn)
	{
		super("cse","priya");
		System.out.println("BrancName:"+bn);
		System.out.println("Firstname:"+fn);
	}
}

public class DemoUser {

	public static void main(String[] args) 
	{
		EnggStudent obj=new EnggStudent("Ise","Devika");
		
	}

}
