package com.methodOverriding;
class Shape{
	public  void draw() {
		System.out.println("Drawing Shape");
	}
}
class Circle extends Shape{
	public void draw() {
		System.out.println("Drawing Circle");	
	}
}

class Square extends Shape{
	public void draw() {
		System.out.println("Drawing Square");
	}
}

public class ShapeCircleSqure {

	public static void main(String[] args) {
		
		Shape s;

        s = new Circle();
        s.draw();

        s = new Square();
        s.draw();
	}

}
