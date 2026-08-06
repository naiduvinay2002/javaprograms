package com.hierarchy;

class Shape{
	
	public double calculateArea() {
		return 0;
	}
}

class Circle extends Shape{
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double calculateCircleArea() {
		return Math.PI * radius*radius;
	}
	
}

class Rectangle extends Shape{
	double length;
	double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double calculateRectangleArea() {
		return length* width;
	}
	
}

class Triangle  extends Shape {
	double base;
	double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double  calculateTriangleArea() {
		return 0.5* base*height;
	}
	
}

public class ShapeHierarchy {

	public static void main(String[] args) {
	
		Circle circle = new Circle(5);
		System.out.println("Circle Area:");
		System.out.println( circle.calculateCircleArea());
		
		Rectangle rectangle = new Rectangle(4, 6);
		System.out.println("\nRectangle Area:");
		System.out.println(rectangle.calculateRectangleArea());
		
		Triangle triangle = new Triangle(3, 7);
		System.out.println("\nTriangle Area:");
		System.out.println(triangle.calculateTriangleArea());
		
	}

}
