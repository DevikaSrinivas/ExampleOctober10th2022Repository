package com.sgtesting.methodreturnvale;
class Sum
{
	int getres(int num)
	{
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		return sum;
	}
}
public class SumDemo {

	public static void main(String[] args)
	{
		Sum obj=new Sum();
		obj.getres(5);

	}

}
