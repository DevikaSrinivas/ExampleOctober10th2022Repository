package com.sgtesting.array;

public class Example5 {

	public static void main(String[] args)
	{
		int num=8;
		int res=0;
		int a[]=new int[10];
		int k=0;
		for(int j=1;j<=10;j++)
		{
			 res=num*j;
			 a[k]=res;
			  k++;
			
		}
		for(int z=a.length-1;z>=0;z--)
		{
			System.out.println(a[z]);
		}
	
		

	}

}
