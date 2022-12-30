package com.sgtesting.inheritance;
class Demo11
{
	void getres1()
	{
		System.out.println("It is a first Statement...!!!!");
	}
}
class Demo2 extends Demo11
{
	void getres2()
	{
		System.out.println("It is a second Statement...!!!!");
	}
}
class Demo3 extends Demo11
{
	void getres3()
	{
		System.out.println("It is a Third Statement..!!!");
	}
}
public class HierarchailInheritanceDemo {

	public static void main(String[] args) {
		Demo3 obj=new Demo3();
		obj.getres3();
		obj.getres1();
		Demo2 obj2=new Demo2();
		obj2.getres2();
		obj.getres1();
	}

}
