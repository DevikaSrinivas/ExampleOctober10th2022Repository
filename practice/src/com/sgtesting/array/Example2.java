package com.sgtesting.array;

public class Example2 {

	public static void main(String[] args)
	{
		int count=0;
	  for(int i=91;i>=71;i--)
	  {
		  if(i%2==1)
		  {
			  count++;
		  }
		 
	  }
	  int s[]=new int[count];
	  int c=0;
	  for(int j=91;j>=71;j--)
	  {
		  if(j%2==1)
		  {
			  s[c]=j;
			  c++;
		  }
	  }
	  for(int z=s.length-1;z>=0;z--)
	  {
		 System.out.println(s[z]);
	  }
 
	}

}
