package com.sgtesting.constructorchaining;
class BasiMaths
{
	double res=0;
	int res1=0;

	BasiMaths(int a,int b)
	{	
		res1=a+b;
		System.out.println(res1);
		res1=a-b;
		System.out.println(res1);

	}
	BasiMaths(int s,double d)
	{
		this(12,12);
		res=(s*d);
		System.out.println(res);

	}
}
public class BasicMathamaticsDemo {

	public static void main(String[] args) 
	{
		BasiMaths obj=new BasiMaths(10,5.0);

	}

}
