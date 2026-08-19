package com.methodOverriding;
class Person{
	 protected void display() {
		 System.out.println("I am a person");
	 }
}
class Student  extends Person{
	
	public void display() {
		System.out.println("I am a student");
	}
}

public class PersonStudent {

	public static void main(String[] args) {

		Student s = new Student();
		s.display();
		
	}

}
