package com.testing.simpleprogram;
class Addiation
{
	Addiation(int a[][],int b[][])
	{ 
	int[][]c=new int[a.length][b.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j] +" ");
			}
			System.out.println();
		
		}
		
	}
}
public class ConstructorDemo {
	

	public static void main(String[] args) 
	{
		int c[][]= {{10,20,30},{5,10,2},{10,10,10}};
		int d[][]= {{10,20,30},{5,10,15},{15,10,11}};
		Addiation obj=new Addiation(c, d);
	
	}

}
