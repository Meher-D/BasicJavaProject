package com.bridgelabz.conditional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeRange {

	public static void main(String[] args) {
		Utility utility=new Utility();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the start Range of Number:-");
	int n=scanner.nextInt();
	System.out.println("Enter the End Range of Number:-");
	int m=scanner.nextInt();
	for(int temp=n;temp<=m;temp++)
	{
		 boolean PrimeNo=utility.PrimeNo(temp);
         if(PrimeNo)
       {
	        System.out.print(" \t"+temp);
	   }
	}
	scanner.close();
}
}
