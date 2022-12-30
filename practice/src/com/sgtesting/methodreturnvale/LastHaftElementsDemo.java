package com.sgtesting.methodreturnvale;
class LastHalf
{
	int[] getnum(int a[])
	{
		int b[]=new int[a.length/2];
		int count=0;
		for(int i=(a.length/2);i<a.length;i++)
		{
			b[count]=a[i];
			count++;

		}
		return b;
		
	}
}
public class LastHaftElementsDemo {

	public static void main(String[] args) 
	{
		int zz[]= {10,20,30,41,50,60};
		LastHalf obj=new LastHalf();
		int [] kk=obj.getnum(zz);
		for(int i=0;i<kk.length;i++)
		{
			System.out.println(kk[i]);
		}
	}

}
