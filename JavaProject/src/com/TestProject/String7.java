package com.TestProject;

import java.util.Scanner;
public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner c=new Scanner(System.in);
		System.out.println("Enter any sentence...");
		String st=c.nextLine();
		st=changeCharacter(st);
		System.out.println("------------------------");
		System.out.println(st);

	}
	
	static String changeCharacter(String st)
	{
		char ch []=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if((ch[i]>='a' && ch[i]<='z') && ch[i]!=' ')
			{
				if(ch[i]!='z')
				ch[i]=(char)(ch[i]+1);
				else
					ch[i]='a';
			}
			else if((ch[i]>='A' && ch[i]<='Z') && ch[i]!=' ')
			{
				if(ch[i]!='Z')
				ch[i]=(char)(ch[i]+1);
				else
					ch[i]='A';
			}
		}
		String s=new String(ch);
		return s;
	}

}
