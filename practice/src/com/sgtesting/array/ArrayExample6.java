package com.sgtesting.array;

public class ArrayExample6 {

	public static void main(String[] args)
	{
		int a[][]= {{10,20,30},{20,30,40}};
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
