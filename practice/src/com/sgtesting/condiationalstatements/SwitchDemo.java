package com.sgtesting.condiationalstatements;

public class SwitchDemo {

	public static void main(String[] args) 
	{
		char ch='p';
		switch(ch)
		{
		case 'a':case 'e':case 'i':case 'o': case 'u':
			System.out.println(ch+ "is vowel");
			break;
			default:
				System.out.println(ch+" is not a vowel");
		}

	}

}
