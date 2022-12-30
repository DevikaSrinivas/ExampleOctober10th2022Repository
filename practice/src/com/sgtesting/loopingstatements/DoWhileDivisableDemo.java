package com.sgtesting.loopingstatements;

public class DoWhileDivisableDemo {

	public static void main(String[] args)
	{
		int i=1;
		do
		{
			if(i%8==0)
			{
				System.out.println(i);
				
			}
			i++;
			
		}while(i<=100);
	}

}
