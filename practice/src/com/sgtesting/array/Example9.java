package com.sgtesting.array;

public class Example9 {

	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40,50,60,70};
		int k[]=new int[a.length+b.length];
		int s=0;
		for(int i=0;i<=a.length-1;i++)
		{
			k[s]=a[i];
			s++;
		}
		for(int j=0;j<=b.length-1;j++)
		{
			k[s]=b[j];
			s++;
		}
	for(int z=k.length-1;z>=0;z--)
	{
		System.out.print(k[z]+" ");
	}
	System.out.println();

	}

}
