package com.hierarchy;

class Animal {
	String name;
	String habitat;
	
	public Animal(String name, String habitat) {
		this.name = name;
		this.habitat = habitat;
	}
	
	public void displayHabitat() {
		System.out.println("Habitat: "+habitat);
	}
	
}

class Mammal extends Animal {
	boolean isWarmBlooded;

	public Mammal(String name, String habitat, boolean isWarmBlooded) {
		super(name, habitat);
		this.isWarmBlooded = isWarmBlooded;
	}
	
	public void displayMammalInfo() {
		System.out.println("Is Warm Blooded: "+isWarmBlooded+"\n");
	}
}

class Bird extends Animal {
	
	boolean canFly;

	public Bird(String name, String habitat, boolean canFly) {
		super(name, habitat);
		this.canFly = canFly;
	}
	
	public void displayBirdInfo() {
		System.out.println("Can fly: "+canFly+"\n");
	}
}

class Reptile extends Animal {
	boolean isColdBlooded;

	public Reptile(String name, String habitat, boolean isColdBlooded) {
		super(name, habitat);
		this.isColdBlooded = isColdBlooded;
	}
	
	public void displayReptileInfo() {
		System.out.println("Is Cold Blooded: "+isColdBlooded);
	}
}
public class AnimalHierarchy {

	public static void main(String[] args) {
		Animal mammal = new Mammal("Lion", "Savannah", true); 
		mammal.displayHabitat(); 
		((Mammal) mammal).displayMammalInfo();
		
		Animal bird = new Bird("Eagle", "Forest", true); 
		bird.displayHabitat();  
		((Bird) bird).displayBirdInfo();
		
		Animal reptile = new Reptile("Snake", "Desert", true); 
		reptile.displayHabitat(); 
		((Reptile) reptile).displayReptileInfo();
	}

}
