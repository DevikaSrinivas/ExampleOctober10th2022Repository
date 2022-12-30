package com.sgtesting.methodreturnvale;
class Count
{
	int  getres(int num)
	{
		int count=0;
		for(int i=num;i>=30;i--)
		{
			if(i%2==1)
			{
				count++;
			}
			
		}
		return count;
		
	}
}
public class CountDemo {

	public static void main(String[] args) 
	{
	
		Count c=new Count();
		int p=c.getres(91);
		System.out.println(p);
		
		
		

	}

}
