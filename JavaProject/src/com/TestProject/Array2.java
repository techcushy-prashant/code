package com.TestProject;

import java.util.Scanner;

public class Array2 {
	
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
		int arr1 []=findMissingElements(arr);
		System.out.println("Missing elements are : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		

	}
	
	static int [] findMissingElements(int arr [])
	{
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		int temp=max/min;
		int newArr []=new int[temp];
		int k=0;
		for(int i=1;i<=temp;i++)
		{
			boolean b=true;
			int p=min*i;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==p)
				{
					b=false;
				}
			}
			if(b==true)
			{
				newArr[k++]=p;
			}
		}
		
		int arr1 []=new int[k];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=newArr[i];
		}
		return arr1;
	}
	

}
