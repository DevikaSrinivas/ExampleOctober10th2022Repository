
package com.sgtesting.array;

public class Example4 {

	public static void main(String[] args)
	{
		int count=0;
		for(int i=50;i<=100;i++)
		{
			if(i%5==0)
			{
				count++;
			}

		}
		int a[]=new int[count];
		int c=0;
		for(int j=50;j<=100;j++)
		{
			if(j%5==0)
			{
				a[c]=j;
				c++;
			}


		}
		for(int z=a.length-1;z>=0;z--)
		{
			System.out.println(a[z]);



		}

	}
}
