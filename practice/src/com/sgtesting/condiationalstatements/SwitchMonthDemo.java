package com.sgtesting.condiationalstatements;

public class SwitchMonthDemo {

	public static void main(String[] args) 
	{
		int month=1;
		switch(month)
		{
		case 1:
			System.out.println(month+" is january");
			break;
		case 2:
			System.out.println(month+" is Feburary");
			break;
		case 3:
			System.out.println(month+" is march");
			break;
		case 4:
			System.out.println(month+" is April");
			break;
		case 5:
			System.out.println(month+" is May");
			break;
		case 6:
			System.out.println(month+" is june");
			break;
		case 7:
			System.out.println(month+" is july");
			break;
		case 8:
			System.out.println(month+" is august");
			break;
		case 9:
			System.out.println(month+" is September");
			break;
		case 10:
			System.out.println(month+" is October");
			break;
		case 11:
			System.out.println(month+" is November");
			break;
		case 12:
			System.out.println(month+" is December");
			break;
		default:
			System.out.println("inavalid weekday");
		}

	}

}
