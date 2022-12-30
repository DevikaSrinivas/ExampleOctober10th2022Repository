package com.sgtesting.donotmethodreturnvalue;
class Addiation
{
	void getres(int x,int y)
	{
		int res=x+y;
		System.out.println(res);
	}
	void getresult(int p,int q)
	{
		int res=p-q;
		System.out.println(res);
	}
}
public class Demo {

	public static void main(String[] args) 
	{
		Addiation obj=new Addiation();
		obj.getres(10, 5);
		obj.getresult(10, 20);


	}

}
