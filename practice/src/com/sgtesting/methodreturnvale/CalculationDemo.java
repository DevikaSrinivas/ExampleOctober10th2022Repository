package com.sgtesting.methodreturnvale;
class Clacualtion
{
	int Addiation(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
		return res;
	}
	int Substraction(int p,int q)
	{
		int res=p-q;
		System.out.println(res);
		return res;
	}
	void Multiplication(int s,int y)
	{
		int res=s*y;
		System.out.println(res);

	}
}
public class CalculationDemo {

	public static void main(String[] args)
	{
		Clacualtion obj=new Clacualtion();
		obj.Addiation(10, 20);
		obj.Substraction(10, 20);
		obj.Multiplication(10, 30);

	}

}
