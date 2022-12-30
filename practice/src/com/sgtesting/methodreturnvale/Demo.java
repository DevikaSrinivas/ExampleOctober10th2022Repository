package com.sgtesting.methodreturnvale;
class Method
{
	String getname(String fname,String place)
	{
		String S=fname+place;
		return S;
		
	}
}

public class Demo {

	public static void main(String[] args) 
	{
		Method obj=new Method();
		String zz=obj.getname("devika","tumkur");
		System.out.println(zz+" ");
		
		

	}

}
