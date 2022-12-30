package com.sgtesting.array;

public class Example17 {

	public static void main(String[] args) 
	{
		int a[][]= {{10,20,30},{10,22,33},{11,12,13}};
		for(int i=0;i<=a.length-1;i++)
			{
				for(int j=0;j<=a[i].length-1;j++)
				{
					System.out.print(a[i+1][0]+" ");
				}
				System.out.println();
			}

	}

}
