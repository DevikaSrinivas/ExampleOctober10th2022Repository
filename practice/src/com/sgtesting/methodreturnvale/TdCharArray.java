package com.sgtesting.methodreturnvale;
class TwoChar
{
	char[][] getch(char a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		return a;
	}
}
public class TdCharArray {

	public static void main(String[] args) 
	{
		char s[][]= {{'a','b','c'},{'e','f','g'},{'h','i','j'}};
	
		TwoChar obj=new TwoChar();
		obj.getch(s);

	}

}
