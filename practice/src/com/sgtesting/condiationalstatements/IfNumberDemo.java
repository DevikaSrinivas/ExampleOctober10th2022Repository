package com.sgtesting.condiationalstatements;

public class IfNumberDemo {

	public static void main(String[] args)
	{
		int num=100;
		if((num<=0)||(num>10))
		{
			System.out.println("number is one digit number");
		}
		else if((num<=10)||(num>100))
		{
			System.out.println("number is two digit number");
		}
		else if((num<=100)||(num>1000))
		{
			System.out.println("number is Three didgit number");
		}
		else if((num<=1000) ||(num>100000))
		{
			System.out.println("number is four digit number");
		}
		else
		{
			System.out.println("invalid number");
		}

	}

}
