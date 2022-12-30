package com.sgtesting.collectionframework;
//class Level
class Genrics<T>
{
	T obj;
	public void add(T obj)
	{
		this.obj=obj;
	}
	public T get()
	{
		return obj;
		
	}
}
public class GenricsDemo {

	public static void main(String[] args)
	{
		//with gerics 
		Genrics<String> obj=new Genrics<String>();
		obj.add("SQL");
		String res=obj.get();
		System.out.println(res);
		obj.add("java");
		String res1=obj.get();
		System.out.println(res1);
		
		//without genrics
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		Genrics obj1=new Genrics();
		obj1.add(10);
		int a=(int) obj1.get();
		System.out.println(a);
		obj1.add("devika");
		String b=(String) obj1.get();
		System.out.println(b);
	}

}
