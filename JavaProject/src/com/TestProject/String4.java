package com.TestProject;

import java.util.Scanner;
public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=c.nextLine();
		st=reArrange(st);
		System.out.println(st);

	}
	
	static String reArrange(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i-1]==' ' && ch[i]!=' ')
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					
					ch[i]=((char)(ch[i]-32));
				}
			}
		}
		String s=new String(ch);
		return s;
	}

}
