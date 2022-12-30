package com.sgtesting.array;

public class Example1 {

	public static void main(String[] args) 
	{
		int count=0;
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				count++;	
			}
			
		}
		//System.out.println(count);
		int a[]=new int[count];
		int k=0;
		for(int j=20;j<=40;j++)
		{
			if(j%2==0)
			{
				a[k]=j;
				k++;
			}
		}
		for(int z=a.length-1;z>=0;z--)
		{
		   System.out.println(a[z]);
		}
	}

}
