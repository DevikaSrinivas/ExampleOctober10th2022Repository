package com.sgtesting.inheritance;
class Example11
{
	int getres(String name)
	{
		return 0 ;
		 
	}
}
class Example111 extends Example11
{
	
	int getres(String name)
	{
		super.getres("devika");
		return 0;
		
	}
}
public abstract class InheritanceDemo {

	public static void main(String[] args)
	{
		Example111 obj=new Example111();
		int res=obj.getres("priya");
		System.out.println(res);

	}

}
