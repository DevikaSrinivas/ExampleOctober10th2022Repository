package com.sgtesting.condiationalstatements;

public class IfWeekDayDemo {

	public static void main(String[] args) 
	{
		String Weekday="Friday";
		if(Weekday=="Sunday")
		{
			System.out.println("is sunday");
		}
		else if(Weekday=="Monday")
		{
			System.out.println("is Monday");
		}
		else if(Weekday=="Tuesday")
		{
			System.out.println("is tuesday");
		}
		else if(Weekday=="Wednesday")
		{
			System.out.println("is Wednesday");
		}
		else if(Weekday=="Thursday")
		{
			System.out.println("is Thursday");
		}
		else if(Weekday=="Friday")
		{
			System.out.println("is Friday");
		}
		else if(Weekday=="Saturday")
		{
			System.out.println("is Saturday");
		}
		else
		{
			System.out.println("is invalid weekday");
		}
	}

}
