package com.sgtesting.casting;

public class Example5 {

	public static void main(String[] args)
	{
		byte a[][]= {{10,20,30},{30,40,10},{10,22,12}};
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
