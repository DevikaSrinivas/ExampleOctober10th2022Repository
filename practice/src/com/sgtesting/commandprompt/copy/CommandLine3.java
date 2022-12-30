package com.sgtesting.commandprompt.copy;

public class CommandLine3 {

	public static void main(String[] args) 
	{
		byte a=Byte.parseByte(args[0]);
		byte b=Byte.parseByte(args[1]);
		int c=(a*b);
		System.out.println(c);

	}

}
