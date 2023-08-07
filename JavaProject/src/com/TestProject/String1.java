package com.TestProject;
import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner c=new Scanner(System.in);
		System.out.println("Enter string : ");
		String st=c.nextLine();
		int count=countChar(st);
		System.out.println(count);

	}

	private static int countChar(String st) {
		
		char ch[]=st.toCharArray();
		int count=0;
		int i=0;
		while((ch[i]>='a' && ch[i]<='z') ||( ch[i]>='A'&& ch[i]<='Z') || (ch[i]>='0' && ch[i]<='9')||ch[i]=='~'||ch[i]=='!'||ch[i]=='@'||ch[i]=='#'||ch[i]=='$'||ch[i]=='%'||ch[i]=='^'||ch[i]=='&'||ch[i]=='*'||ch[i]=='('||ch[i]==')'||ch[i]=='_'||ch[i]=='-'||ch[i]=='+'||ch[i]=='?'||ch[i]=='/'||ch[i]=='<'||ch[i]=='>'||ch[i]==','||ch[i]=='.'|| ch[i]==' ')
       {
    	   count++;
    	   i++;
       }
		return count;
	}

}
