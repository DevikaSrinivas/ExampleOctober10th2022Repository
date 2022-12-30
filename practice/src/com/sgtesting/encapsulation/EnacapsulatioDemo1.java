package com.sgtesting.encapsulation;
class Bank
{
	private long accountno;
	String bankname;
	public long getAccountno()
	{
		return accountno;
		
	}
	public void setaccountNo(int accountno)
	{
		this.accountno=accountno;
	}
}
public class EnacapsulatioDemo1 {

	public static void main(String[] args) 
	{
		Bank obj=new Bank();
		obj.bankname="centeral";
		System.out.println(obj.bankname);
		obj.setaccountNo(111111111);
		long acc=obj.getAccountno();
		System.out.println(acc);
	}

}
