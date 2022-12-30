package com.sgtesting.array;

public class OneDTArrayDemo {

	public static void main(String[] args) 
	{
		int a[]= {10,20,30,10,8};
		int b[][]=new int[2][3];
		int x=0;
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=a[x];
				x++;
			}
		}


	}
}