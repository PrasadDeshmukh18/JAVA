//Program to convert Degrees to Faherenheit
package com.ptpl.methods;
import java.util.*;
public class DegreesToFaherenheit {

	public static void main(String[] args) {
		double f, c;
		System.out.println("Enter the temprature in celsius : - ");

		Scanner sc = new Scanner(System.in);

		c = sc.nextDouble();

		f = 9 / 5 * c + 32;
		System.out.println("Temprature in celsius = " + c);
		System.out.println("Temprature in Fahrenheit = " + f);

	}

}
