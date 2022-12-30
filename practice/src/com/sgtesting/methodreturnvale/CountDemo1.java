package com.sgtesting.methodreturnvale;
class Count1
{
	int getsum()
	{
		int count=0;
		for(int i=50;i<=100;i++)
		{
			if(i%6==0)
			{
				count++;
			}
			
		}
		return count;
	}
}
public class CountDemo1 {

	public static void main(String[] args) 
	{
		Count1 obj=new Count1();
		int zz=obj.getsum();
		System.out.println(zz);
	}

}
