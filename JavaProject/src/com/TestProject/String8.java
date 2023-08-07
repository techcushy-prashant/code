package com.TestProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner c=new Scanner(System.in);
		System.out.println("Enter any sentence");
		String st=c.nextLine();
		findFrequency(st);

	}
	
	static void findFrequency(String st)
	{
		char ch []=st.toCharArray();
		int count []=new int[128];
		Map<Character,Integer> mp=new HashMap<>();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			count[ch[i]]=count[ch[i]]+1;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				//mp.put((char)i, count[i]);
				System.out.println((char)i+"----->"+count[i]);
			
			}
		}
		//System.out.println(mp);
	}

}
