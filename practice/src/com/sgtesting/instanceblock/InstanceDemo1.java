//if a class contains instance block and constructor
package com.sgtesting.instanceblock;
class Demouser
{
	Demouser(int number)
	{
		System.out.println("Number:"+number);
	}
	{
		System.out.println("It is a Instance block");
	}
}

public class InstanceDemo1 {

	public static void main(String[] args)
	{
		Demouser obj=new Demouser(10);
		

	}

}
