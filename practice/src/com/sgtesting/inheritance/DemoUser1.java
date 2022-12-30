package com.sgtesting.inheritance;
class Example1112
{
	String firstname;
	int age;
	void show()
	{
		System.out.println("FirstNme:"+firstname);
		System.out.println("Age:"+age);
	}
}
class Example12 extends Example1112
{
	String firstname;
	int age;
	//Example12 (String firsname,int age)
	{
		super.firstname="devika";
		super.age=12;
	}
	void display(String firstname,int age)
	{
		System.out.println("FirstName:"+firstname);
		System.out.println("Age:"+age);
	}
}
public class DemoUser1 {

	public static void main(String[] args) 
	{
		Example12 obj=new Example12();
		obj.show();
		obj.display("priya",12);
		

	}

}
