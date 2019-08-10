package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Distance 
{
	public static void main(String[] args)
	{
		Utility utility=new Utility();
	   Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the cordinator x=");
	double x=scanner.nextDouble();
	System.out.println("Enter the cordinator y=");
	double y=scanner.nextDouble();
	double result;	
	result=utility.Euclidean(x,y);
		System.out.println("Euclidean Distance is:" +result);
		scanner.close();
		
	}
}
