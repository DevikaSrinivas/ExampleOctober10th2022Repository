package com.sgtesting.array;

public class ArrayDemo19 {

	public static void main(String[] args) 
	{
		int a[][]= {{10,20,30},{20,12,22},{20,11,12}};
		int b[][]= {{1,2,3},{10,20,30},{10,20,12}};
		int res[][]=new int[3][3];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[i].length-1;j++)
			{
				res[i][j]=a[i][j]+b[i][j];
				System.out.print(res[i][j]+" ");
			
			}
			System.out.println();
			
		}
		
	}

}
