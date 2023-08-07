package com.TestProject;

public class Adding {
	
	public static boolean  add(int a)
	{
		if(a%2==0)
			return true;
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,7,8,9,19};
		for(int i=0;i<arr.length;i++)
		{
			if(add(arr[i]))
				System.out.println(arr[i]);
					
		}

	}

}
