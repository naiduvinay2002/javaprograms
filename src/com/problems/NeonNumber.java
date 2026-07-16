package com.problems;

import java.util.Scanner;

public class NeonNumber {
	public static boolean isNeon(int num) {
		int sq=num*num;
		int sum=0;
		while(sq!=0){
			sum=sum+(sq%10);
			sq/=10;
		}
		return num==sum;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n=sc.nextInt();
			if(isNeon(n)) {
				System.out.println(n+" is a Neon Number");
			}
			else {
				System.out.println(n+" is not a Neon Number");

			}
			sc.close();
	}
		
}

