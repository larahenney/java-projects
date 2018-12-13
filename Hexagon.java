package com.cognizant.shapes;

public class Hexagon {
	
	void calculateArea(double side) {
		double area = 6 * (Math.pow(side, 2))/(4 * Math.tan(Math.PI/6));
		System.out.println("The area of this hexagon is " + area);
	}
}
