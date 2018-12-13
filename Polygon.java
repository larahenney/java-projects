package com.cognizant.shapes;

public class Polygon {
	
	public void calculateArea(int sides, double length) {
		double area = sides * Math.pow(length, 2)/(4 * Math.tan(Math.PI/sides)); 
		System.out.println("The area of this polygon is " + area);
	}
	
}
