package com.TestProject;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner c=new Scanner(System.in);
		System.out.println("Enter  number..");
		int n=c.nextInt();
		System.out.println("Enter the value of K ?");
		int k=c.nextInt();
		int sum=getSum(n,k);
		System.out.println("Sum f digit is : "+sum);
			
		}

	static int getSum(int n,int k)
	{
		int temp=0;
		int sum=0;
		while(n!=0)
		{
			int rem=n%k;
			temp=(temp*10)+rem;
			n=n/k;
		}
		
		while(temp!=0)
		{
			int rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		return sum;
		
	}

}
