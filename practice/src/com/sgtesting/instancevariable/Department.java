 package com.sgtesting.instancevariable;

public class Department {
	
	int id;
	String name;
	int phoneno;

	public static void main(String[] args)
	{
		Department obj=new Department();
		obj.id=111;
		obj.name="Devika";
		obj.phoneno=99006;
		System.out.println("Id " +obj.id);
		System.out.println("Name " +obj.name);
		System.out.println("Phone " +obj.phoneno);

	}

}
