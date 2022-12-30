package com.sgtesting.array;

public class Example3 {

	public static void main(String[] args) 
	{
		int count=0;
		int res=0;
		for(int i=10;i>=1;i--)
		{
			res=i*i;
			count++;
		}



		int a[]=new int[count];
		int c=0;
		for(int j=10;j>=1;j--)
		{
			res=j*j;
			a[c]=j;
			c++;
		}
		for(int z=a.length-1;z>=0;z--)
		{
			System.out.println(a[z]);
		}

	}
}

