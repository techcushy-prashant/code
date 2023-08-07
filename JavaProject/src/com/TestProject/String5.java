package com.TestProject;
import java.util.Scanner;

public class String5 {




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner c=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=c.nextLine();
		reArrange(st);
		
	}

	static void reArrange(String st)
	{
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i-1]==' ' && ch[i]!=' ')
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					/*
					if(i!=0 &&ch[i]=='a')
					{
						ch[i]=(char)(97);
					}
					else
					*/

					ch[i]=((char)(ch[i]-32));
				}
			}
		}
		String s=new String(ch);
		String []str=s.split(" ");
		
		String s1="Am";
		String s2="A";
		String s3="AM";
		for(int i=0;i<str.length;i++)
		{
			if(str[i].equals(s1))
			{
				str[i]="am";
			}
			
			if(str[i].equals(s2))
			{
				str[i]="a";
			}
			
			if(str[i].equals(s3))
			{
				str[i]="am";
			}
		}
		
		/*
		String p="am";
		if(str[0].equals(p))
		{
			str[0]="Am";
		}
		*/
		for( int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
	}


}
