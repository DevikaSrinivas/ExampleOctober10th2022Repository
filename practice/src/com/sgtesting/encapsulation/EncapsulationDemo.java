package com.sgtesting.encapsulation;
class Employee
{
	private int age;
	public int getres()
	{
		return age;
		
	}
	public void setres(int age)
	{
		this.age=age;
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Employee obj=new Employee();
		obj.setres(12);
		int res=obj.getres();
		System.out.println(res);
	}

}
