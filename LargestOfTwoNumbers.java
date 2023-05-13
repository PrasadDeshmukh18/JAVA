package com.ptpl.methods;
import java.util.*;
public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		int largest = 0, num1, num2;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter any two numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();

		if (num1 > num2)
			largest = num1;
		else
			largest = num2;

		System.out.println("Largest number = " + largest);

	}

}
