package com.TestProject;

import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int n=c.nextInt();
		int arr []=new int[n];
		System.out.println("Enter elements in the form of 0 and 1 .");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=c.nextInt();
			
		}
		arr=reArrangeArray(arr);
		System.out.println("Array after arrangement ..");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}
	
	static int [] reArrangeArray(int [] arr)
	{
		int countZero=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				countZero++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i<countZero)
			{
				arr[i]=0;
			}
			else
				arr[i]=1;
		}
		return arr;
	}

}
