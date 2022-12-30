package com.testing.simpleprogram;
class Transpose
{
	Transpose(int a[][])
	{

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[j][i]+" ");
			}	
			System.out.println();

		}

	}

}
public class TransposeDemo {

	public static void main(String[] args) 
	{
		int s[][]= {{10,20,30},{1,2,3},{5,6,7}};

		Transpose obj=new Transpose(s);

	}

}
