package com.testing.simpleprogram;
class Resultant
{
	Resultant(int a[],int b[])
	{
		int k=0;
		
		int d[]=new int[a.length+b.length];
	
		for(int i=0;i<a.length;i++)
		{
			d[k]=a[i];
			k++;
		}
		for(int j=0;j<b.length;j++)
		{
			d[k]=b[j];
			k++;
		}
	for(int p=0;p<d.length;p++) 
	{
		System.out.print(d[p]+" ");
	}
	System.out.println();
	}
	
}
public class ResultantDemo {

	public static void main(String[] args) 
	{
		int a1[]= {10,20,20};
		int c[]= {5,10,10,20};
		Resultant obj=new Resultant(a1, c);
		
	}

}
