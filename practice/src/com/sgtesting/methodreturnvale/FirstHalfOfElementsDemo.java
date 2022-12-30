package com.sgtesting.methodreturnvale;
class FirstHalf
{
	int[] getres(int a[])
	{
		int b[]=new int[a.length/2];
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		return b;
	
		
	}
}
public class FirstHalfOfElementsDemo {

	public static void main(String[] args) 
	{
		int[] z= {10,20,30,40};
		FirstHalf obj=new FirstHalf();
		int[] zz=obj.getres(z);
		for(int ss:zz)
		{
			System.out.println(ss);
		}

	}

}
