package com.TestProject;

public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String st="Every win is different. Playing in WI has its own challenge. Happy with the way things went. We gave it a good shot, unfortunately we couldn't get any play today. We actually went out with a positive intent yesterday. Rain had its final say. We were quite confident. You know how difficult it is batting last. We always wanted that kind of score where we wanted the opposition to go for it. There wasn't much on the surface. No play today, unfortunate for us. Siraj, I have been watching him closely. He's taken such a giant step. He has led this attack. I don't want anyone to lead the attack. I want everyone to lead when they are having the ball in their hand. You want the entire pace battery taking the responsibility. You need guys like Ishan (Kishan). We wanted quick runs, we promoted him, he wasn't afraid. He was the first one to put his hand up. In Test matches, you need guys who stabilise the innings like what Virat (Kohli) did, he played superbly. You need the mixture of everything. We have depth, we have got variety. We are in the right place. It's about getting the job done. I always believe in getting better as a team. I said after the World Test Championship final as well. We've played consistent cricket. That's what we are looking at. We want to focus on all three aspects of the game. We need to be a good fielding unit. Bowlers - how they respond under pressure. What sort of mindset batters go in with under challenging conditions. That's what I am looking forward to.";
		String s=st;
		String str="we";
		int count=0;
		String ch[]=s.split(" ");
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i].equals(str))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
