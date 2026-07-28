package com.dashboard;

public class Mobile {
	String brand;
	String model;
	int price;
	
	public void setMobileDetails(String brand,String model,int price) {
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	
	public void displayMobileDetails() {
		System.out.println("Mobile Details");
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
	}
	
	public static void main(String[] args) {
		Mobile m= new Mobile();
		m.setMobileDetails("Samsung", "S24", 80000);
		m.displayMobileDetails();
	}
	
	

}
