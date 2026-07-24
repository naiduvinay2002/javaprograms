package com.assignments;

public class ArithmeticOperations {
	
	public static void add(int a,int b) {
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
	}
	
	public static void sub(int a,int b) {
		System.out.println("Subtraction of "+a+" from "+b+" is "+(b-a));
	}
	
	public static void mul(int a,int b) {
		System.out.println("Multiplication of "+a+" and "+b+" is "+(a*b));
	}
	
	public static void div(int a,int b) {
		System.out.println("Division of "+a+" by "+b+" is "+(a/b));
	}

	public static void main(String[] args) {
		
		add(10,20);
		sub(20,30);
		mul(10,20);
		div(20,10);
		
		
	}

}
