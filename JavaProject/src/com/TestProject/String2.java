package com.TestProject;

import java.util.Scanner;
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner c=new Scanner(System.in);
		System.out.println("Enter string ....");
		String st=c.nextLine();
		st=reverseString(st);
		System.out.println("Reversed string is : ");
		System.out.println(st);

	}
	
	static String reverseString(String st)
	{
		String s="";
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			s=ch[i]+s;
			
		}
		return s;
	}

}
