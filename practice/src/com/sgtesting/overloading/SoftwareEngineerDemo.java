package com.sgtesting.overloading;
class Software
{
	Software(String name,String place)
	{
		System.out.println("Name:"+name);
		System.out.println("Place:"+place);
		System.out.println("+++++++++++++++++++++++++++++++");
	}
	Software(int salary)
	{
		System.out.println("Salary:"+salary);
	}
}
public class SoftwareEngineerDemo {

	public static void main(String[] args) 
	{
		Software obj=new Software("tcs","banglore");
		Software obj1=new Software(120);
	}

}
