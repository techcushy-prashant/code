package com.collection;

public interface Anonymous {

			
		public void display();
	
			
			public static void main(String [] args)
			{
				////an.dislayResult(25);
			//	an.display();
				
				Anonymous an=()->System.out.println("hiiiiii");
				an.display();
			}

	

}
