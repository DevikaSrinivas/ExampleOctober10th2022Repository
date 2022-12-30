package com.sgtesting.constructor;
class  Demo
{
	Demo(int j)
	{
		int fact=1;
		for(int i=j;i>=1;i--)
		{
			fact=fact*i;
			
		}
		System.out.println(fact);
	}
}
public class FactorialDemo {

	public static void main(String[] args)
	{
		
		Demo obj=new Demo(5);
		
		

	}

}
