package com.cognizant.shapes;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int menu;
		String selection = "\nPlease select an option the following menu. \n \n" + "Area Calculator: \n"
				+ "1. Circle \n"
				+ "2. Rectangle\n"
				+ "3. Hexagon\n" 
				+ "4. Polygon\n" + "\n"
				+ "Area Formulas: \n"
				+ "5. Circle \n"
				+ "6. Rectangle\n"
				+ "7. Hexagon\n" 
				+ "8. Polygon\n"
				+ "9. Exit \n" + "\n"; 

		
		System.out.print(selection);
		System.out.print("Your selection: ");
		menu = input.nextInt();

		while (menu < 1 || menu > 9) {
			System.out.print("******************************************\n");
			System.out.print("*** You have entered invalid selection ***\n");
			System.out.print("******************************************\n");
			System.out.print(selection);
			menu = input.nextInt();
		}

		switch (menu) {
		case 1:
			Circle circle = new Circle(); 
			System.out.println("What is the radius of the circle?");
			System.out.print("Radius: ");
			double radius = input.nextDouble(); 
			circle.calculateArea(radius);
			break; 
		case 2: 
			Rectangle rectangle = new Rectangle();
			System.out.println("What is the length of the rectangle?");
			System.out.print("Rectangle length: ");
			double length = input.nextDouble(); 
			System.out.println("What is the width of the rectangle?");
			System.out.print("Rectangle width: ");
			double breadth = input.nextDouble(); 
			rectangle.calculateArea(length, breadth);
			break; 
		case 3: 
			Hexagon hexagon = new Hexagon();
			System.out.println("How long are each of the sides on the hexagon?");
			System.out.print("Hexagon side length: ");
			double side = input.nextDouble();
			hexagon.calculateArea(side);
			break; 
		case 4:
			Polygon poly = new Polygon(); 
			System.out.println("How many sides does this polygon have?");
			System.out.print("Number of sides: ");
			int sides = input.nextInt(); 
			System.out.println("How long are each of the sides on the polygon?");
			System.out.print("Length of the sides: ");
			double lengthp = input.nextDouble(); 
			poly.calculateArea(sides, lengthp); 
			break; 
		case 5:
			System.out.println("The area of a circle is calculated by multiplying pie and radius squared");
			break; 
		case 6:
			System.out.println("The area of a rectangle is calculated using the formula length * breadth");
			break; 
		case 7:
			System.out.println("The area of an equilateral hexagon is calculated using this forumula: 6 * (side length^2)/(4 * tan(pi/6)");
			break; 
		case 8:
			System.out.println("The area of an equilateral polygon is calculated using this forumula: number of sides * (side length^2)/(4 * tan(pi/6)");
			break; 
		case 9:
			System.out.println("Goodbye!");
			break; 
		}
		
		input.close();

	}

}
