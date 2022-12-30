//If static members are available in the independent class

package com.sgtesting.staticmembers;
class BasicMaths
{
	static String type;
	static int number;
	static void addiation(int x,int y)
	{
		int res=(x+y);
		System.out.println("# addiation of numbers:"+res);
	}

}
public class StaticDemo1 {

	public static void main(String[] args) 
	{
		BasicMaths.addiation(10, 20);
		BasicMaths.type="alzebra";
		BasicMaths.number=10;
		System.out.println(BasicMaths.type);
		System.out.println(BasicMaths.number);

	}

}
