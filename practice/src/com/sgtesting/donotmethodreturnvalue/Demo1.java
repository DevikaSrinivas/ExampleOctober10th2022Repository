package com.sgtesting.donotmethodreturnvalue;
class Example
{
	String[] getarray()
	{
		String s[]= {"Java","RDBMS","Sql"};
		return s;
		
	}
}
public class Demo1 {

	public static void main(String[] args)
	{
		Example obj=new Example();
		String zz[]=obj.getarray();
		for(int i=0;i<zz.length;i++)
		{
			System.out.println(zz[i]);
		}

	}

}

