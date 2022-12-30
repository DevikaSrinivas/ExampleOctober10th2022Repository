package com.sgtesting.loopingstatements;

public class PrimeDemo {

	public static void main(String[] args) 
	{
		int temp=0;
		int num=12;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("The given  numberis not prime");
		}
		else
		{
			System.out.println("The given number is a prime number");
		}


	}

}
