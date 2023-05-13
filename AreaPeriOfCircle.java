// Write a Java program to print the area and perimeter of a circle.
package com.ptpl.methods;

public class AreaPeriOfCircle {

	public static void main(String[] args) {
		
		double pi=3.14, perimeter, area, radius = 5.5;
		perimeter = 2*pi*radius;
        area = pi*radius*radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
       
        
	}

}
