package com.sgtesting.array;
class TwoDCharArryDemo
{
	void getres(char a[][])
	{
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class TwoDCharArray {

	public static void main(String[] args)
	{
		char ch[][]= {{'a','b','c'},{'e','f','d'},{'w','h','k'}};
		TwoDCharArryDemo obj1=new TwoDCharArryDemo();
		obj1.getres(ch);
	}
}



