package com.sgtesting.condiationalstatements;

public class NestedIfElseDemo {

	public static void main(String[] args) 
	{
		int marks=87;
		if(marks<35 && marks>=40)
		{
			System.out.println("Result is pass");
		}
		else if(marks<40 && marks>=59)
		{
			System.out.println("Result is Second Class");
		}
		else if(marks<59 && marks>=84)
		{
			System.out.println("Result is First Class");
		}
		else if(marks<84 && marks>=100)
		{
			System.out.println("result is distinction");
		}
		//else 
		//{
			//System.out.println("invalid input");
	//	}
	}


}
