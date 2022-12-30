package com.sgtesting.instancevariable;
class ThwoWheelers
{
	String name;
	String place;
	int price;
}
class FourWheelers
{
	String name;
	int price;
	String place;
}
class HeavyVechile
{
	String name;
	int price;
	String place;
}
public class InstanceDemo3 {

	public static void main(String[] args)
	{
		ThwoWheelers obj=new ThwoWheelers();
		obj.name="bike";
		obj.place="Banglore";
		obj.price=12;
		System.out.println("Name:"+obj.name);
		System.out.println("Place:"+obj.place);
		System.out.println("Price:"+obj.price);
		
		FourWheelers obj1=new FourWheelers();
		
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*"+" ");
			}
			for(int j=1;j<i;j++)
			{
				
				
				
				
				
				
				
				

				System.out.print("*"+" ");
			}
			for(int k=4;k>i;k--)
			{
				System.out.print(" "+" ");
			}
			System.out.println();
		}
	}

}























