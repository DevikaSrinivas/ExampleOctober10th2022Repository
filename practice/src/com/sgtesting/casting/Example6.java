package com.sgtesting.casting;

public class Example6 {

	public static void main(String[] args)
	{
		long a[][]={{10,20,30},{10,5,11},{20,39,40}};
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
