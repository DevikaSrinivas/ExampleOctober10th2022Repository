package com.sgtesting.condiationalstatements;

public class IfDivisable {

	public static void main(String[] args)
	{
		int num=99;
		if(num%3==0 && num%9==0)
		{
			System.out.println("number is divisiable by 3 and 9");
		}
		else
		{
			System.out.println("number is not divisable by 3 and 9");
		}

	}

}
