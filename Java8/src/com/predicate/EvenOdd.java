package com.predicate;

import java.util.function.Predicate;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr []= {12,15,16,89,36,20,100,90,6,8,14};
		Predicate<Integer> p1=i1->i1%2==0;
		Predicate<Integer> p2=i2->i2>20;
		
		for(int i=0;i<arr.length;i++)
		{
			// checking number is even and should be greater than 20.
			/*
			if(p1.and(p2).test(arr[i]))
			{
				System.out.print(arr[i]+" ");
			}
			*/
			
			// checking number is even and should be greater than 20.
			/*
			if(p1.or(p2).test(arr[i]))
			{
				System.out.print(arr[i]+" ");
			}
			*/
			 // Number should not be even.
			if(p1.negate().test(arr[i]))
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
