package com.sgtesting.constructor;
class Company
{
	String name;
	int price;
	String place;
	Company()
	{
		name="TCS";
		price=1000;
		place="Banglore";
		System.out.println("Name:"+name);
		System.out.println("Price:"+price);
		System.out.println("Place:"+place);
	}
}
public class NoArgsConstructorDemo1 {

	public static void main(String[] args) 
	{
		Company obj=new Company();

	}

}
