package com.sgtesting.methodreturnvale;
class Calculation
{
	int addation(int x,int y)
	{
		int res=(x+y);
		System.out.println(res);
		return res;
	}
	int subtraction(int x,int y)
	{
		int res=(x-y);
		System.out.println(res);
		return res;
				
	}
}
public class ExampleDemo {

	public static void main(String[] args) 
	{
		Calculation obj=new Calculation();
		obj.addation(10, 50);
		obj.subtraction(5, 5);
	}

}
