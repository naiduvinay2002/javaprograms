 package com.hierarchy;

class Vehicle{
	String make;
	String model;
	int year;
	public Vehicle(String make, String model, int year) {
		
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void displayInfo() {
		System.out.println("====Basic Details Of Vehicle====");
		System.out.print("Vehicle made by: "+make);
		System.out.print("\nVehicle model: "+model);
		System.out.println("\nManufactured in: "+year);
	}
	
}

class Car extends Vehicle{
	int numberOfDoors;

	public Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayCarInfo() {
		System.out.println("Number of doors: "+numberOfDoors+"\n");
	}
	
}

class Truck extends Vehicle {
	int cargoCapacity;

	public Truck(String make, String model, int year, int cargoCapacity) {
		super(make, model, year);
		this.cargoCapacity = cargoCapacity;
	}
	
	public void displayTruckInfo() {
		System.out.println("Cargo Capacity: "+cargoCapacity+"\n");
	}
}

class Motorcycle extends Vehicle{
	boolean hasSidear;

	public Motorcycle(String make, String model, int year, boolean hasSidear) {
		super(make, model, year);
		this.hasSidear = hasSidear;
	}
	
	public void displayMotorcycleInfo () {
		System.out.print("Has Sidecar: "+hasSidear);
	}
}
public class Hierarchy {

	public static void main(String[] args) {
		
		Vehicle car = new Car("Toyota", "Corolla", 2022, 4); 
		car.displayInfo();
		((Car) car).displayCarInfo();
		
		Vehicle truck = new Truck("Ford", "F-150", 2021, 1000); 
		truck.displayInfo(); 
		((Truck) truck).displayTruckInfo();
		
		Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street Glide", 2023, true); 
		motorcycle.displayInfo(); 
		((Motorcycle) motorcycle).displayMotorcycleInfo();
	}

}
