package com.sgtesting.methodreturnvale;
class Array
{
	int getres(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		return 0;
	}
}
public class ArrayDemo {

	public static void main(String[] args)
	{
		int s[]= {10,20,30,40};
		Array obj=new Array();
		obj.getres(s);
	}

}
