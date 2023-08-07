package com.TestProject;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the length of the Array...");
		int n=c.nextInt();
		int arr []=new int[n];
		System.out.println("Enter the elements in the array ...");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=c.nextInt();
		}
		System.out.println("Enter the number how much you want to Right shift : ");
		int rs=c.nextInt();
		arr=rightShift(arr,rs);
		System.out.println("Array after right shift...");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}


	}
	
	static int [] rightShift(int [] arr,int rs)
	{
		int temp=rs%arr.length;
		int arr1 []=new int[temp];
		int k=0;
		for(int i=arr.length-temp;i<arr.length;i++)
		{
			arr1[k++]=arr[i];
		}
		
		int j=arr.length-1-temp;
		int t=arr.length-1;
		while(j>=0)
		{
			arr[t]=arr[j];
			t--;
			j--;
		}
		
		for(int i=0;i<temp;i++)
		{
			arr[i]=arr1[i];
		}
		return arr;
		
	}

}
