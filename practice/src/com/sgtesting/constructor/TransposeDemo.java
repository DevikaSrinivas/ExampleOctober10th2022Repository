package com.sgtesting.constructor;
class Transpose
{
	Transpose(int[][] s)
	{
		int[][]  res=new int[3][3];
		for(int i=0;i<s.length;i++)
			{
				for(int j=0;j<s[i].length;j++)
				{
				
					System.out.print(res[j][i]+" ");
				}
				System.out.println();
			}
	}
}
public class TransposeDemo {

	public static void main(String[] args) 
	{
		int q[][]= {{10,20,30},{5,10,15},{1,2,3}};
		Transpose obj=new Transpose(q);
	}

}
