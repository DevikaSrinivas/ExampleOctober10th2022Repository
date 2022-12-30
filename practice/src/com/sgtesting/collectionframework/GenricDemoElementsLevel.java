package com.sgtesting.collectionframework;
class Gerics1
{
	public static<E> void readelements (E[] elements)
	{
		for(E element:elements)
		{
			System.out.println(element);
		}
	}
}
public class GenricDemoElementsLevel {

	public static void main(String[] args) 
	{
		String[] color= {"red","blue","black","white"};
		Gerics1.readelements(color);
		System.out.println("+++++++++++++++++++++++++++++");
		Integer[] a= {10,20,30,40};
		Gerics1.readelements(a);
	}

}
