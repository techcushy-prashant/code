package com.collection;

public class AnonymusInnerClass {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Runnable rn=new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<=5;i++)
				{
					System.out.println(i);
				}
				
			}
		};

		
		
		Thread t=new Thread(rn);
		t.start();
		for(int j=0;j<=5;j++)
		{
			System.out.println("prashant..");
		}

	}

}
