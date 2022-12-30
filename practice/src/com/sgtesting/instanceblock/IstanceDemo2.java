package com.sgtesting.instanceblock;
class Demo1
{
	{
		System.out.println("It is first instance block");
	}
	{
		System.out.println("It is  second instance block");
	}
	{
		System.out.println("it is third instance block");
	}
}
public class IstanceDemo2 {

	public static void main(String[] args) {
		Demo1 obj=new Demo1
				();

	}

}
