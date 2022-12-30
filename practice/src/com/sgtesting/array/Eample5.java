package com.sgtesting.array;

public class Eample5 {

	public static void main(String[] args)
	{
		int count=0;
		for(int i=10;i<=60;i++)
		{
			if(i%3==0)
			{
				count++;
			}
		}
		int s[]=new int[count];
		int k=0;
		for(int j=10;j<=60;j++)
		{
			if(j%3==0)
			{
				s[k]=j;
				k++;
			}
		}
		for(int z=s.length-1;z>=0;z--)
		{
			System.out.println(s[z]);
		}
	}

}


