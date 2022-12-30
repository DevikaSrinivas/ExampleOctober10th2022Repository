package com.sgtesting.loopingstatements;

public class DoWhileCubeDemo {

	public static void main(String[] args) 
	{
		int i=1;
		do
		{
			int res=(i*i*i);
			System.out.println(res);
			i++;
		}while(i<=10);

	}

}
