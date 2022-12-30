package com.sgtesting.inheritance;
class Example
{
	void getres1()
	{
		System.out.println("It is a firstsatament");
	}
}
class Example1 extends Example
{
	void getres2()
	{
		System.out.println("It is a second statement");
	}
}
class Example2 extends Example
{
	void getres3()
	{
		System.out.println("It is a third statement");
	}
}
class Example3 extends Example2
{
	void getres4()
	{
		System.out.println("It is fourth Statement");
	}
}

public  class HybridInheritanceDemo {

	public static void main(String[] args)
	{
		Example3 obj=new Example3();
		obj.getres4();
		obj.getres3();
		Example2 obj1=new Example2();
		obj1.getres3();
		obj1.getres1();
		Example1 obj3=new Example1();
		obj3.getres2();
		obj3.getres1();
		
	}

}
