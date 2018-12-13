package com.cognizant.shapes;

public class Circle {
	
	public void calculateArea(double radius) {
		
		double area = Math.PI*Math.pow(radius, 2); 
		System.out.println("The area of this circle is " + area);
	}

	
}
