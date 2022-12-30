package com.sgtesting.array;

public class Example8 {

	public static void main(String[] args)
	{
		int k=0;
		String s[]= {"java","Selenium","SQL","DBMS"};
		String l[]=new String[s.length];
		for(int i=0;i<s.length-1;i++)
		{
			l[k]=s[k];
			k++;
		}
		for(int z=s.length-1;z>=0;z--)
		{
			System.out.println(s[z]);
			
		}
	}
	

}
