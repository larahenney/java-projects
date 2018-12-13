package com.cognizant.shapes;

public class Circle {
	
	void calculateArea(double radius) {
		
		double area = Math.PI*Math.pow(radius, 2); 
		System.out.println("The area of this circle is " + area);
	}

	
}
