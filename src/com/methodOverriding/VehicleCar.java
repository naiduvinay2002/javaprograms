package com.methodOverriding;

class Vehicle{
	public void start() {
		System.out.println("Vehicle Started");
	}
}
class Car extends Vehicle{
	@Override
	public void start() {
		System.out.println("Car Started");
	}
}
public class VehicleCar {

	public static void main(String[] args) {
		
		Vehicle v = new  Vehicle();
		Car c = new Car();
		v.start();
		c.start();
		
	}

}
