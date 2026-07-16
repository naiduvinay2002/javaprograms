package com.problems;

import java.util.Scanner;

public class StrongNumber {
	public static int getFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
		
	}
	public static boolean isStrong(int num)
	{
		int temp=num;
		int sum=0;
		while(num!=0) {
			int d=num%10;
			sum+=getFactorial(d);
			num/=10;
		}
		return temp==sum;
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
		if(isStrong(n))
			System.out.println(n+" is a Strong Number");
		else
			System.out.println(n+" is not a Strong Number");

		sc.close();
	}

}
