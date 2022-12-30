package com.sgtesting.condiationalstatements;

public class WeekdaySwitchDemo {

	public static void main(String[] args)
	{
		int Weekday=1;
		switch(Weekday)
		{
		case 1:case 2:case 3:case 4: case 5:case 6: case 7:

			System.out.println(Weekday+"is weekday");
			break;
		default:

			System.out.println(Weekday+ "is invalid weekday");
		}
	}

}

