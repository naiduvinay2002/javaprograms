package com.methodOverriding;
class Animal{
	public void makeSound() {
		System.out.println("Animal Sound");
	}
	
}
class Dog extends Animal{
	
	public void makeSound() {
		System.out.println("Bark");
	}
}

public class AnimalDog {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		Dog d = new Dog();
		a.makeSound();
		d.makeSound();
	}

}
