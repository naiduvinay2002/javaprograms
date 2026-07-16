package com.problems;

import java.util.Scanner;

public class ArmsrtongNumber {
	public static int getPower(int base,int exp)
	{
		int p=1;
		for(int i=1;i<=exp;i++){
			p=p*base;
		}
		return p;
	}
	public static int getCount(int n) {
		int c=0;
		while(n>0)
		{
			c++;
			n/=10;
		}
		return c;
	}
	public static boolean isArmstrong(int n) {
		int count=getCount(n);
		int temp=n;
		int sum=0;
		
		while(n!=0)
		{
			int base=n%10;
			sum=sum+getPower(base,count);
			n/=10;
			
		}
		return sum==temp;
		

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num=sc.nextInt();
		if(isArmstrong(num))
			System.out.println(num+" is an Armstrong Number");
		else
			System.out.println(num+" is not an Armstrong Number");
		sc.close();
	}

}
