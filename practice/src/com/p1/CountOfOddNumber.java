package com.p1;

public class CountOfOddNumber {

	public static void main(String[] args)
	{
		int count=0;
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				count=count+1;
				System.out.println(count);
			}
			
		}

	}

}
