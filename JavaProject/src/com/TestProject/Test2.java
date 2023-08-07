package com.TestProject;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c=new Scanner(System.in);
		System.out.println("Enter string..");
		String st=c.nextLine();
		st=reverseString(st);
		System.out.println(st);

	}
	
	static String reverseString(String st)
	{
		String s="";
		
		char ch[]=st.toCharArray();
		int i=0;
		for(char c:ch)
		{
			i++;
		}
		int j=0;
		while(j<i)
		{
			s=ch[j]+s;
			j++;
		}
		return s;
	}

}
