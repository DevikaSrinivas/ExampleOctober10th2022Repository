package com.sgtesting.inheritance;
class Demo
{
	void getres1(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
}
class Demo1 extends Demo
{
	void getres(int a,int b)
	{
		int res=a/b;
		System.out.println(res);
	}
}
public class SimpleInheritanceDemo {

	public static void main(String[] args) 
	{
		Demo1 obj=new Demo1();
		obj.getres(10,5);
		obj.getres1(10,30);
	
		

	}

} 