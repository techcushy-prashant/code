package com.collection;

public class Anonynous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("hiofdhdkhd;j");
				
			}
			
		}; 
		

		Thread t=new Thread(r);
		t.start();
		
	}

}
