package com.sgtesting.array;

public class ArrayDemo17 {

	public static void main(String[] args)
	{
		int a[][]= {{10,20,30},{40,50,60},{10,20,30}};
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
