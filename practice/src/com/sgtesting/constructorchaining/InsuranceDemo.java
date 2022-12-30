package com.sgtesting.constructorchaining;
class Insurance
{
	Insurance(String name,String place)
	{
		System.out.println("Name:"+name);
		System.out.println("Place:"+place);
	}
	Insurance(int price)
	{
		this("Devika","Banglore");
		System.out.println("Price:"+price);
	}
}
public class InsuranceDemo {

	public static void main(String[] args)
	{
		Insurance obj=new Insurance(1222);
		
	}

}
