package com.testing.simpleprogram;




class Sort
{
	Sort(int a[])
	{
		int first=0;
		int second=1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int third=first+second;
					first=second;
					second=third;
				}
				System.out.println(second);
			}

		}
	}
}

	public class SortDemo {

		public static void main(String[] args) 
		{
			int c[]= {10,20,5};
			{
				Sort obj=new Sort(c);
			}

		}
	}
