package com.TestProject;
import java.util.Scanner;

public class String9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner c=new Scanner(System.in);
		System.out.println("Enter any string");
		String st=c.nextLine();
		st=shiftCharacter(st);
		System.out.println(st);

	}
	
	static String shiftCharacter(String st)
	{
		char ch[]=st.toCharArray();
		//char ch1 []=new char[ch.length];
		int i=0;
		while(i<ch.length)
		{
				
				if(i%2==0 && ch[i]!=' ')
				{
					if(ch[i]=='a')
					{
						ch[i]='Y';
						i++;
					}
					else if(ch[i]=='b')
						{
						ch[i]='Z';
						i++;
						}
					else if(ch[i]=='A')
					{
						ch[i]='y';
						i++;
					}
					else if(ch[i]=='B')
					{
						ch[i]='z';
						i++;
					}
					else
					{
						ch[i]=(char)(ch[i]-2);
						i++;
					}
				}
				else if(i%2!=0 && ch[i]!=' ')
				{
					if(ch[i]=='y')
					{
						ch[i]='A';
						i++;
					}
					else if(ch[i]=='z')
					{
						ch[i]='B';
						i++;
					}
					else if(ch[i]=='Y')
					{
						ch[i]='a';
						i++;
					}
					else if(ch[i]=='Z')
					{
						ch[i]='b';
						i++;
					}
					else
					{
						ch[i]=(char)(ch[i]+2);
						i++;
					}
						
				}
				else
				{
					i++;
				}
			
		}
		
		/*
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]=='Z' && i%2!=0)
			{
				ch1[i]='a';
			}
			 
			else if(ch1[i]=='Z' && i%2==0)
				{
					ch1[i]='A';
				}
			else if(ch1[i]=='a' && i%2==0)
			{
				ch1[i]='Z';
			}
			
			else if(ch1[i]=='a' && i%2!=0)
			{
				ch1[i]='z';
			}
			
		}*/
		String s=new String(ch);
		return s;
	}

}
