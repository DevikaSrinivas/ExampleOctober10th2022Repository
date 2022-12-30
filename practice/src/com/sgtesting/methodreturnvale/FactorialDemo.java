package com.sgtesting.methodreturnvale;
class Fact
{
	int getres(int num)
	{
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}


}
public class FactorialDemo {

	public static void main(String[] args)
	{
		Fact obj=new Fact();
		int zz=obj.getres(5);
		System.out.println(zz);

	}

}
