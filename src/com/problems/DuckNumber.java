package com.problems;

import java.util.Scanner;

public class DuckNumber {
	public static boolean isDuck(int num) {
		while(num!=0) {
			int d=num%10;
			if(d==0)
				return true;
			num/=10;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n= sc.nextInt();
		
		if(isDuck(n))
			System.out.println(n+" is a Duck Number");
		else
			System.out.println(n+" is not a Duck Number");

		sc.close();
	}

}
