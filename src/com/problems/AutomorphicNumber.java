package com.problems;

import java.util.Scanner;

public class AutomorphicNumber {
	public static boolean isAutomorphic(int num) {
		int temp=num;
		int sq=num*num;
		while(temp!=0) {
			if(temp%10 != sq%10)
				return false;
			temp/=10;
			sq/=10;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		
		if(isAutomorphic(n))
			System.out.println(n+" is an Automorphic Number");
		else
			System.out.println(n+" is not an Automorphic Number");
		
		sc.close();

	}

}
