package com.sgtesting.loopingstatements;

public class WhileCountDemo {

	public static void main(String[] args) 
	{
		int count=0;
		int i=100;
		while(i<=150) 
		{
			if(i%2==0)
			{
				count++;
			}
			i++;
		
			
			
		}
		System.out.println(count);
	}
	
}
