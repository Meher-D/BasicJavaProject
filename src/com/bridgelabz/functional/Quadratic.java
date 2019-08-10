package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value of x*x:a");
		double a=scanner.nextDouble();
		System.out.println("Enter the value of x:b");
		double b=scanner.nextDouble();
		System.out.println("Enter the value of constant: c");
		double c=scanner.nextDouble();
		utility.calculate(a,b,c);
		scanner.close();
		}

}
