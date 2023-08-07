package com.TestProject;


public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String st="Cricbuzz is a cricket news website owned by Times Internet. "
				+ "It features, news, articles and live coverage of cricket matches including videos, "
				+ "text commentary, player stats and team rankings. Their website also offers a mobile app";
        String s="cricket";
        String ch []=st.split(" ");
        for(int i=0;i<ch.length;i++)
        {
        	
        	if(ch[i].equals(s))
        	{
        		String emptyString="";
        		char c[]=s.toCharArray();
        		for(int j=0;j<c.length;j++)
        		{
        			emptyString=c[j]+emptyString;
        		}
        		ch[i]=emptyString;
        	}
        	
        }
        System.out.println(st);
        System.out.println("---------------------------");
        for(int i=0;i<ch.length;i++)
        {
        	System.out.print(ch[i]+" ");
        }
		
	}

}
