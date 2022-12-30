package com.sgtesting.array;

public class ArrayDemo16 {

	public static void main(String[] args) 
	{
		int a[][]= {{10,20,30},{10,20,30},{20,30,40}};
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=40;
		a[1][1]=20;
		a[1][2]=40;
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
