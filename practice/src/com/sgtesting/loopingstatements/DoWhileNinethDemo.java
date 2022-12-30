package com.sgtesting.loopingstatements;

public class DoWhileNinethDemo {

	public static void main(String[] args) 
	{
		int num=9;
		int i=1;
		do
		{
			int res=num*i;
			System.out.println(num+"*"+i+"="+num*i);
			i++;
		}while(i<=10);

	}

}
