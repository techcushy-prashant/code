package com.TestProject;

import java.util.Scanner;

public class Array3 {

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
		int i=0,j=arr.length-1;
		while(i<j)
		{
			if(arr[i]==1 && arr[j]==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			else if(arr[i]==0 && arr[j]==0 )
			
				i++;
				
			
			else if(arr[i]==1 && arr[j]==1)
			
				j--;
			
			else
			{
				i++;
				j--;
			}
			
		}
		return arr;
	}

}
