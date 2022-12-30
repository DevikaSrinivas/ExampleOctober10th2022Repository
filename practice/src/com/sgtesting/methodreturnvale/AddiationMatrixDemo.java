package com.sgtesting.methodreturnvale;
class Methd
{
	int[][] getres(int a[][],int b[][])
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
		return b;
		
	}
}
public class AddiationMatrixDemo {

	public static void main(String[] args)
	{
		
		int j[][]= {{10,20,30},{5,10,15},{20,30,40}};
		int k[][]= {{1,2,3},{5,10,15},{10,20,30}};
		Methd obj=new Methd();
		obj.getres(j, k);
	}

}
