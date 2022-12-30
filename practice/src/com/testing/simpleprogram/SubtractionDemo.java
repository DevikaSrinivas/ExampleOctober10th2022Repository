package com.testing.simpleprogram;
class Subtraction
{
	Subtraction(int a[][],int b[][])
	{
		int[][] res=new int[a.length][b.length];
		for( int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				res[i][j]=a[i][j]-b[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class SubtractionDemo {

	public static void main(String[] args) 
	{
		int c[][]= {{10,10,10},{15,10,20},{11,20,12}};
		int d[][]= {{5,5,5},{10,5,10},{10,10,10}};
		Subtraction obj=new Subtraction(c,d);
	}

}
