package com.sgtesting.condiationalstatements;

public class SwitchStatement {

	public static void main(String[] args) 
	{
		char ch='j';
		switch(ch)
		{
		case 'a':
			System.out.println(ch+ "vowel number");
			break;
		case 'e':
			System.out.println(ch+" is volwel number");
			break;
		case 'i':
			System.out.println(ch+ "is a vowel number");
			break;
		case 'o':
			System.out.println(ch+ "is vowel number");
			break;
		case 'u':
			System.out.println(ch+ " is vowel number");
			break;
		default:
			System.out.println(ch + "is not a vowel");
			break;
		}



	}

}
