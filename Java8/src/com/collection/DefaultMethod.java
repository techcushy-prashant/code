package com.collection;

interface Test
	{
	   default void display()
	   {
		   System.out.println("Default method inside interface...");
	   }
	}


public class DefaultMethod implements Test {
	
	public void display()
	   {
		   System.out.println("Default method inside Test class...");
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1=new DefaultMethod();
		t1.display();

	}

}
