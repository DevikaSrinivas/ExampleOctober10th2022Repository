package com.sgtesting.loopingstatements;

public class ForCountDemo {

	public static void main(String[] args)
	{
		int count=0;
		for(int i=40;i<=80;i++)
		{
			if(i%8==0)
			{
				count++;
				
			}
			
		}
		System.out.println(count);

	}

}
