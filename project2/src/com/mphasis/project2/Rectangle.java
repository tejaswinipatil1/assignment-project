package com.mphasis.project2;

public class Rectangle {
	
	private int length;
	private int breadth;


	
	public Rectangle() {
	}


	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}


	
	public void printData() {
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
	}


	
	public void printArea() {
		int area = length * breadth;
		System.out.println("Area: " + area);
	}


	
	public void printPerimeter() {
		int perimeter = 2 * (length + breadth);
		System.out.println("Perimeter: " + perimeter);
	}
}


public class App {


	
	public static void main(String[] args) {
		// Create two objects of this class, r1 and r2. Show the output of both the
		// constructor sand all method of these two objects
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(4, 4);
		r1.printData();
		r1.printArea();
		r1.printPerimeter();


		r2.printData();
		r2.printArea();
		r2.printPerimeter();
		;


	}

}
