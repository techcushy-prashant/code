package com.collection;

 interface inter
{
	  static void display()
	  {
		  System.out.println("Interface method.....");
	  }
}


public class InterfaceStatic implements inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inter.display();
		

	}

}
