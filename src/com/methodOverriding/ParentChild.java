package com.methodOverriding;
class Parent{
	public static void print() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	
	public static void print() {
		System.out.println("Child");
	}
}

public class ParentChild {

	public static void main(String[] args) {
		
		Parent.print();
		Child.print();

	}

}
