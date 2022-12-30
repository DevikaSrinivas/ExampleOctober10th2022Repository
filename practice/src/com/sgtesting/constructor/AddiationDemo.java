package com.sgtesting.constructor;
class Addiation
{
	Addiation(int [][]a,int b[][])
	{
		int[][] res=new int[a.length][b.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				res[i][j]=a[i][j]+b[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		
		}
	}
}
public class AddiationDemo {

	public static void main(String[] args)
	{
		int s[][]= {{10,20,30},{1,2,3},{5,10,15}};
		int p[][]= {{10,20,30},{5,10,5},{10,20,30}};
		Addiation obj=new Addiation(s, p);

	}

}
