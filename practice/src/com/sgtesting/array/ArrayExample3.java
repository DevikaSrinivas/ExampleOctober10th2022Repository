//Read The Elements from the array in Reverse Order
package com.sgtesting.array;

public class ArrayExample3 {

	public static void main(String[] args)
	{
		String a[]= {"java","python","rdbms","sql"};
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}

	}

}
