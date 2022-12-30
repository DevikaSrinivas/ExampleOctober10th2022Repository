package com.sgtesting.staticmembers;
class Factorial
{
	static int getres(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
			
		}
		
		return fact;
	}
	static int getsum(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			sum++;
			
		}
		return sum;
	}
}
public class StaticDemo2 
{

	public static void main(String[] args) 
	{
		int res=Factorial.getres(5);
		System.out.println(res);
		int res1=Factorial.getsum(10);
		System.out.println(res1);
	}

}
