package com.sgtesting.inheritance;
class Sample1
{
	void getres1()
	{
		System.out.println("It is a firststatement!!!");
	}
}
class Sample2 extends Sample1
{
	void getres2()
	{
		System.out.println("It is Seccond Statement!!!");
	}
}
class Sample3 extends Sample2
{
	void getres3()
	{
		System.out.println("It is a Third Statement..!!!");
	}
}
public class MultiLevelDemo {

	public static void main(String[] args) 
	{
		Sample3 obj=new Sample3();
		obj.getres3();
		obj.getres2();
		Sample3 obj2=new Sample3();
		obj.getres2();
		obj.getres1();

	}

}
