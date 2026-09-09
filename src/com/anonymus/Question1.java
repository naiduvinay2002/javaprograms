package com.anonymus;

import java.util.Scanner;

@FunctionalInterface
interface NumberChecker{
	boolean checkNumber(int a);
}

@FunctionalInterface
interface CharChecker{
	void checkChar(char c);
}

public class Question1 {
	
	public static boolean isPrime(int num) {
		int count=0;
		if(num<=1)
			return false;
		for (int i = 1; i <= num; i++) {
			if(num%i==0)
				count++;
			
		}
		if(count==2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		NumberChecker nc =new NumberChecker() {
			
			@Override
			public boolean checkNumber(int a) {
				
				return isPrime(a);
			}
		};
		
		CharChecker cc =new CharChecker() {
			
			@Override
			public void checkChar(char c) {

				int asci=(int)c;
				
				System.out.println("Ascii Value: "+asci);
				if(isPrime(asci))
					System.out.println("Ascii Value is Prime");
				else
					System.out.println("Ascii Value is not Prime");
			}
		};
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int num=sc.nextInt();
		System.out.print("Character: ");
		char ch =sc.next().charAt(0);
		
		System.out.println("\nNumber is prime: "+nc.checkNumber(num));
		cc.checkChar(ch);
		
		sc.close();
	}

}
