package com.sgtesting.array;

public class SubstractionDemo {

	public static void main(String[] args) 
	{
		int a[][]= {{10,20,30},{15,20,30}};
		int b[][]= {{5,10,15},{10,15,20}};
		int res[][]=new int[2][3];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=b[i].length-1;j++)
			{
				res[i][j]=a[i][j]-b[i][j];
				System.out.print(res[i][j]+" ");
			}
		System.out.println();
		}

	}

}
