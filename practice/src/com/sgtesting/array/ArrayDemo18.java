package com.sgtesting.array;

public class ArrayDemo18 {

	public static void main(String[] args)
	{
		int a[][]= {{10,20,30},{15,22,30},{10,20,30}};
		for(int[] i:a)
		{
			for(int k:i)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
