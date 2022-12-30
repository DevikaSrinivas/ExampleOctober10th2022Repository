package com.sgtesting.array;

public class Example7 {

	public static void main(String[] args)
	{
		int count=0;
		int a[]= {10,20,30};
		int b[]= {20,40,40};
		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
			
		}
		for(int z=a.length-1;z>=0;z--)
		{
			System.out.println(c[z]);
		}
	}


}