package com.sgtesting.constructor;
class Employee12
{
	Employee12(String name,String place)
	{
		System.out.println("ename:"+name);
		System.out.println("eplace:"+place);
	}
	Employee12(String company,int price)
	{
		System.out.println("ecomapany:"+company);
		System.out.println("eprice:"+price);
	}
}
public class ConstructorOverloadingDemo {

	public static void main(String[] args) 
	{
		Employee12 obj=new Employee12("devika","tumkur");
		Employee12 obj1=new Employee12("Banglore",12);
		
	}

}
