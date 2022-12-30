package com.sgtesting.constructorchaining;
class Demo
{
	Demo(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
public class OneDArrayDemo {

	public static void main(String[] args)
	{
		int a[]= {10,20,0,40};
		Demo obj=new Demo(a);

	}

}
