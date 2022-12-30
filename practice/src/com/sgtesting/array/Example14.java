package com.sgtesting.array;

public class Example14 {

	public static void main(String[] args)
	{
		int a[]= {50,45,8,27,15,10,35};
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]<=a[j])
				{
					int first=a[i];
					a[i]=a[j];
					a[j]=first;
					
				}
				
			}
			System.out.println(a[i]);
		}

	}

}
