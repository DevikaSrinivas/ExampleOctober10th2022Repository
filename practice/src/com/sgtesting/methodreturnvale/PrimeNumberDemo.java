package com.sgtesting.methodreturnvale;
class PrimeDemo
{
	int getres(int num)
	{
		int c=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				c=c+1;
				break;
			}
		}
		if(c==0)
		{
			System.out.print("The given number is prime");
		}
		else
		{
			System.out.print("The given number is not a prime number");
		}
		return c;


	}
}
public class PrimeNumberDemo {

	public static void main(String[] args)
	{
		PrimeDemo obj=new PrimeDemo();
		obj.getres(12);		


	}

}
