package com.ptpl.methods;
import java.util.*;
public class CompareTwoNumbers {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner("Enter two numbers");
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		}
		else if(b>a) {
			System.out.println(b+" is greater than "+a);
		}
		else if(a==b) {
			System.out.println(b+" is equal "+a);
		}
		else {
			System.out.println("something when wrong");
		}

	}

}
