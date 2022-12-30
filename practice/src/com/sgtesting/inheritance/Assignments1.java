package com.sgtesting.inheritance;
class Aaa
{
	void getres()
	{
		System.out.println("It is a First Statement");
	}
}
class Bbb extends Aaa
{
	void getres1()
	{
		System.out.println("It is a second statement");
	}
}
class D extends Aaa

{
	void getres2()
	{
		System.out.println("It is a third statement");
	}
}
class E extends D
{
	void getres3()
	{
		System.out.println("It is a Fourth statement");
	}
}
public class Assignments1 {

	public static void main(String[] args) 
	{
		E obj=new E();
		obj.getres3();
		obj.getres2();
		Bbb obj1=new Bbb();
		obj1.getres1();
		obj1.getres();
	

	}

}
