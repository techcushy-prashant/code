package com.collection;


interface Left
	{
	     default void m1()
	     {
	    	 System.out.println("Left....");
	     }
	}


interface Right
{
     default void m1()
     {
    	 System.out.println("Right....");
     }
}

public class DefaultMethod1 implements Left,Right {
	
	
	public void m1()
	{
		//System.out.println("Own method......");
		//Left.super.m1();
		Right.super.m1();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultMethod1 df=new DefaultMethod1();
		
		df.m1();
	}

}
